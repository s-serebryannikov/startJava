package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNums;
    private int count;

    public Player(String name) {
        this.name = name;
        enteredNums = new int[10];
    }

    public boolean addNum(int number) {
        if (number > 0 && number <= 100) {
            enteredNums[count] = number;
            count++;
            return true;
        } else return false;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, count + 1);
    }

    public int getCount() {
        return count;
    }

    public void clearNumbers() {
        Arrays.fill(enteredNums, 0, count, 0);
        count = 0;
    }
}