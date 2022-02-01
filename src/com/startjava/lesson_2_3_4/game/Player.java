package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers;
    private int count;

    Player(String name, int length) {
        this.name = name;
        enteredNumbers = new int[length];
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count >= 1) {
            this.count+=count;
        } else this.count = 0;
    }
}