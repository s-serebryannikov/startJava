package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;
    int playerNumber;

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {

        Random random = new Random();
        int hiddenNum = random.nextInt(100) + 1;
        do {
            playerNumber = enteredVal(p1);
            Attempts(p1, playerNumber);
            if (playerNumber == hiddenNum) {
                playerWin(p1);
                System.out.println("Значения игрока " + p2.getName() + ": " + Arrays.toString(arrayAttempts(p2)));
                updateArr(p1);
                updateArr(p2);
                break;
            } else if (playerNumber < hiddenNum && p1.getCount() < 10) {
                numberLess(p1);
            } else if (playerNumber > hiddenNum && p1.getCount() < 10) {
                numberGreater(p1);
            } else {
                playerLost(p1);
                break;
            }

            playerNumber = enteredVal(p2);
            Attempts(p2, playerNumber);
            if (playerNumber == hiddenNum) {
                playerWin(p2);
                System.out.println("Значения игрока " + p1.getName() + ": " + Arrays.toString(arrayAttempts(p1)));
                updateArr(p1);
                updateArr(p2);
                break;
            } else if (playerNumber < hiddenNum && p2.getCount() < 10) {
                numberLess(p2);
            } else if (playerNumber > hiddenNum && p2.getCount() < 10) {
                numberGreater(p2);
            } else {
                playerLost(p2);
                break;
            }
        } while (true);
    }

    public int enteredVal(Player p) {
        System.out.println("\nИгрок " + p.getName() + " попробуйте угадать число: ");
        return scanner.nextInt();
    }

    public void Attempts(Player p, int pn) {
        if (p.getCount() < 10) {
            p.getArrNum()[p.getCount()] = pn;
            p.setCount(1);
        } else System.out.println("Попытки закончились");
    }

    public int[] arrayAttempts(Player p) {
        return Arrays.copyOf(p.getArrNum(), p.getCount());
    }

    public void playerWin(Player p) {
        System.out.println("\nИгрок " + p.getName() + " вы победили!");
        System.out.println("Игрок " + p.getName() + " угадал число " + playerNumber + " с " + p.getCount() + " попытки\n");
        System.out.println("Значения игрока " + p.getName() + ": " + Arrays.toString(arrayAttempts(p)));
    }

    public void playerLost(Player p) {
        System.out.println("У " + p.getName() + " закончились попытки\n");
        System.out.println("Значения игрока " + p1.getName() + ": " + Arrays.toString(arrayAttempts(p1)));
        System.out.println("Значения игрока " + p2.getName() + ": " + Arrays.toString(arrayAttempts(p2)));
    }


    public void updateArr(Player p) {
        Arrays.fill(p.getArrNum(), 0);
        p.setCount(0);
    }

    public void numberLess(Player p) {
        System.out.println("\nИгрок " + p.getName() + ", данное число меньше того, что загадал компьютер");
    }

    public void numberGreater(Player p) {
        System.out.println("\nИгрок " + p.getName() + ", данное число больше того, что загадал компьютер");
    }
}

