package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNums;
    private int lot;
    private int countWin;
    private int count;

    public Player(String name) {
        this.name = name;
        enteredNums = new int[10];
    }

    public String getName() {
        return name;
    }

    public boolean addNum(int number) {
        if (number > 0 && number <= 100) {
            enteredNums[count] = number;
            count++;
            return true;
        } else return false;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, count);
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public int getCountWin() {
        return countWin;
    }

    public void setCountWin(int num) {
        if (num == 1) {
            countWin++;
        } else countWin = 0;
    }

    public int getCount() {
        return count;
    }

    public void clearNumbers() {
        Arrays.fill(enteredNums, 0, count, 0);
        count = 0;
    }
}