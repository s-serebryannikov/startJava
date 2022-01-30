package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private String name;
    private int[] arrNum;
    private int count = 0;
    private int playerNum;
    Scanner scanner = new Scanner(System.in);

    Player(String name, int n) {
        this.name = name;
        this.arrNum = new int[n];
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count++;
    }

    public String getName() {
        return name;
    }

    public void Attempts(int n) {
        if (getCount() < 10) {
            arrNum[getCount()] = n;
            setCount();
        } else System.out.println("Попытки закончились");
    }

    public int[] arrayAttempts() {
        return Arrays.copyOf(arrNum, count);
    }

    public void updateArr() {
        Arrays.fill(arrNum, 0);
        this.count = 0;
    }

    public void playerWin(int playerNumber) {
        System.out.println("\nИгрок " + getName() + " вы победили!");
        System.out.println("Игрок " + getName() + " угадал число " + playerNumber + " с " + getCount() + " попытки\n");
        System.out.println("Значения игрока " + getName() + ": " + Arrays.toString(arrayAttempts()));
    }

    public void numberLess() {
        System.out.println("\nИгрок " + getName() + ", данное число меньше того, что загадал компьютер");
    }

    public void numberGreater() {
        System.out.println("\nИгрок " + getName() + ", данное число больше того, что загадал компьютер");
    }

    public void inputVal() {
        System.out.println("\nИгрок " + getName() + " попробуйте угадать число: ");
        setPlayerNum(scanner.nextInt());
    }
}