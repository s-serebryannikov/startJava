package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers;
    private int count;
    private int playerNumber;

    Player(String name) {
        this.name = name;
        enteredNumbers = new int[10];
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        if (playerNumber > 0 && playerNumber <= 100) {
            this.playerNumber = playerNumber;
        } else count--;
    }

    public void setEnteredNumbers(int playerNumber) {
        enteredNumbers[count] = playerNumber;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, count);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count >= 1) {
            this.count++;
        } else this.count = 0;
    }

    public void clearNumbers() {
        Arrays.fill(enteredNumbers, 0);
        count = 0;
    }
}