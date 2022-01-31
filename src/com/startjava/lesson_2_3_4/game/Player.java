package com.startjava.lesson_2_3_4.game;


public class Player {
    private String name;
    private int[] arrNum;
    private int count = 0;

    Player(String name, int n) {
        this.name = name;
        this.arrNum = new int[n];
    }

    public int[] getArrNum() {
        return arrNum;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count >= 1) {
            this.count += count;
        } else this.count = 0;
    }

    public String getName() {
        return name;
    }
}