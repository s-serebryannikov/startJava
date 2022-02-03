package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;
    int hiddenNum;

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        Random random = new Random();
        hiddenNum = random.nextInt(100) + 1;
        do {
            inputNumber(p1);
            checkAttempts(p1);
            if (compareNum(p1)) {
                break;
            }
            if (p1.getCount() == 10) {
                playerLost(p1);
                break;
            }

            inputNumber(p2);
            checkAttempts(p2);

            if (compareNum(p2)) {
                break;
            }
            if (p1.getCount() == 10) {
                playerLost(p2);
                break;
            }
        } while (true);
    }

    private void inputNumber(Player p) {
        System.out.println("\nИгрок " + p.getName() + " попробуйте угадать число: ");
        p.setPlayerNumber(scanner.nextInt());
    }

    private void checkAttempts(Player p) {
        if (p.getCount() < 10) {
            p.setEnteredNumbers(p.getPlayerNumber());
            p.setCount(1);
        } else playerLost(p);
    }

    private void playerWin(Player p) {
        System.out.println("\nИгрок " + p.getName() + " вы победили!");
        System.out.println("Игрок " + p.getName() + " угадал число " + p.getPlayerNumber() + " с " + p.getCount() + " попытки\n");
        showEnteredNumbers(p1.getEnteredNumbers(), p1);
        showEnteredNumbers(p2.getEnteredNumbers(), p2);
    }

    private void playerLost(Player p) {
        System.out.println("У " + p.getName() + " закончились попытки\n");
        showEnteredNumbers(p1.getEnteredNumbers(), p1);
        showEnteredNumbers(p2.getEnteredNumbers(), p2);
    }

    public void showEnteredNumbers(int[] array, Player p) {
        System.out.print("Значения игрока " + p.getName() + ": ");
        for (int num : Arrays.copyOf(array, p.getCount())) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public boolean compareNum(Player p) {
        boolean isWin = false;
        if (p.getPlayerNumber() < hiddenNum) {
            System.out.println("\nИгрок " + p.getName() + ", данное число меньше того, что загадал компьютер");
        } else if (p.getPlayerNumber() > hiddenNum) {
            System.out.println("\nИгрок " + p.getName() + ", данное число больше того, что загадал компьютер");
        } else if (p.getPlayerNumber() == hiddenNum) {
            playerWin(p);
            p1.clearNumbers();
            p2.clearNumbers();
            isWin = true;
        }
        return isWin;
    }
}

