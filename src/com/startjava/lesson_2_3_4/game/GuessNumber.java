package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;
    private int hiddenNum;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        Random random = new Random();
        hiddenNum = random.nextInt(100) + 1;
        p1.clearNumbers();
        p2.clearNumbers();
        do {
            if (checkAttempts(p1)) {
                break;
            }
            inputNumber(p1);
            if (compareNum(p1)) {
                break;
            }

            if (checkAttempts(p2)) {
                break;
            }
            inputNumber(p2);
            if (compareNum(p2)) {
                break;
            }
        } while (true);
        showEnteredNumbers(p1);
        showEnteredNumbers(p2);
    }

    private void inputNumber(Player p) {
        System.out.println("\nИгрок " + p.getName() + " попробуйте угадать число: ");
        p.setEnteredNum(scanner.nextInt());
    }

    private boolean checkAttempts(Player p) {
        if ((p.getCount()) == 10) {
            System.out.println("У " + p.getName() + " закончились попытки\n");
            return true;
        }
        return false;
    }

    private void showEnteredNumbers(Player p) {
        System.out.print("Значения игрока " + p.getName() + ": ");
        for (int number : p.getEnteredNums()) {
            if (number > 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private boolean compareNum(Player p) {
        boolean isWin = false;
        if (p.getEnteredNums()[p.getCount()] < hiddenNum) {
            System.out.println("\nИгрок " + p.getName() + ", данное число меньше того, что загадал компьютер");
        } else if (p.getEnteredNums()[p.getCount()] > hiddenNum) {
            System.out.println("\nИгрок " + p.getName() + ", данное число больше того, что загадал компьютер");
        } else if (p.getEnteredNums()[p.getCount()] == hiddenNum) {
            System.out.println("\nИгрок " + p.getName() + " вы победили!");
            System.out.println("Игрок " + p.getName() + " угадал число " + p.getEnteredNums()[p.getCount()] + " с " + (p.getCount() + 1) + " попытки\n");
            p.setCount();
            isWin = true;
        }
        p.setCount();
        return isWin;
    }
}