package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;
    private int playerNumber;

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        Random random = new Random();
        int hiddenNum = random.nextInt(100) + 1;
        do {
            playerNumber = inputNumber(p1);
            countingAttempts(p1, playerNumber);
            if (playerNumber == hiddenNum) {
                playerWin(p1);
                System.out.print("Значения игрока " + p2.getName() + ": ");
                outputEnteredValues(p2.getEnteredNumbers(), p2);
                clearNumbers(p1);
                clearNumbers(p2);
                break;
            } else if (playerNumber < hiddenNum && p1.getCount() < 10) {
                System.out.println("\nИгрок " + p1.getName() + ", данное число меньше того, что загадал компьютер");
            } else if (playerNumber > hiddenNum && p1.getCount() < 10) {
                System.out.println("\nИгрок " + p1.getName() + ", данное число больше того, что загадал компьютер");
            } else {
                playerLost(p1);
                break;
            }

            playerNumber = inputNumber(p2);
            countingAttempts(p2, playerNumber);
            if (playerNumber == hiddenNum) {
                playerWin(p2);
                System.out.print("Значения игрока " + p1.getName() + ": ");
                outputEnteredValues(p1.getEnteredNumbers(), p1);
                clearNumbers(p1);
                clearNumbers(p2);
                break;
            } else if (playerNumber < hiddenNum && p2.getCount() < 10) {
                System.out.println("\nИгрок " + p2.getName() + ", данное число меньше того, что загадал компьютер");
            } else if (playerNumber > hiddenNum && p2.getCount() < 10) {
                System.out.println("\nИгрок " + p2.getName() + ", данное число больше того, что загадал компьютер");
            } else {
                playerLost(p2);
                break;
            }
        } while (true);
    }

    private int inputNumber(Player p) {
        System.out.println("\nИгрок " + p.getName() + " попробуйте угадать число: ");
        return scanner.nextInt();
    }

    private void countingAttempts(Player p, int playerNumber) {
        if (p.getCount() < 10) {
            p.getEnteredNumbers()[p.getCount()] = playerNumber;
            p.setCount(1);
        } else System.out.println("Попытки закончились");
    }

    private int[] showEnteredNumbers(Player p) {
        return Arrays.copyOf(p.getEnteredNumbers(), p.getCount());
    }

    private void playerWin(Player p) {
        System.out.println("\nИгрок " + p.getName() + " вы победили!");
        System.out.println("Игрок " + p.getName() + " угадал число " + playerNumber + " с " + p.getCount() + " попытки\n");
        System.out.print("Значения игрока " + p.getName() + ": ");
        outputEnteredValues(p.getEnteredNumbers(), p);
    }

    private void playerLost(Player p) {
        System.out.println("У " + p.getName() + " закончились попытки\n");
        System.out.println("Значения игрока " + p1.getName() + ": " + Arrays.toString(showEnteredNumbers(p1)));
        System.out.println("Значения игрока " + p2.getName() + ": " + Arrays.toString(showEnteredNumbers(p2)));
    }

    private void clearNumbers(Player p) {
        Arrays.fill(p.getEnteredNumbers(), 0);
        p.setCount(0);
    }

    public void outputEnteredValues(int[] array, Player p) {
        for (int num : Arrays.copyOf(array, p.getCount())) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

