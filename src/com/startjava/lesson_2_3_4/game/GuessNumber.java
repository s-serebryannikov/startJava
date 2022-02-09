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
            inputNumber(p1);
            if (compareNum(p1)) {
                break;
            }
            inputNumber(p2);
            if (compareNum(p2)) {
                break;
            }
        } while (!checkAttempts(p1) && !checkAttempts(p2));
        showEnteredNumbers(p1);
        showEnteredNumbers(p2);
    }

    private void inputNumber(Player p) {
        while (true) {
            System.out.println("\nИгрок " + p.getName() + " попробуйте угадать число: ");
            int number = scanner.nextInt();
            if (p.addNum(number)) {
                break;
            } else System.out.println("Число " + number + " не входит в диапазон (0,100]\nПопробуйте ещё раз");
        }
    }

    private boolean checkAttempts(Player p) {
        if ((p.getCount()) == 10) {
            System.out.println("У " + p.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private boolean compareNum(Player p) {
        int number = p.getEnteredNums()[p.getCount() - 1];
        String name = p.getName();
        if (number < hiddenNum) {
            System.out.println("Игрок " + name + ", данное число меньше того, что загадал компьютер");
        } else if (number > hiddenNum) {
            System.out.println("Игрок " + name + ", данное число больше того, что загадал компьютер");
        } else {
            System.out.println("\nИгрок " + name + " вы победили!");
            System.out.println("Игрок " + name + " угадал число " + number + " с " + p.getCount() + " попытки\n");
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
}