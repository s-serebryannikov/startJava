package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerNumber;
        int hiddenNum = random.nextInt(100) + 1;
        do {
            p1.inputVal();
            p1.Attempts(p1.getPlayerNum());

            if (p1.getPlayerNum() == hiddenNum) {
                p1.playerWin(p1.getPlayerNum());
                System.out.println("Значения игрока " + p2.getName() + ": " + Arrays.toString(p2.arrayAttempts()));
                p1.updateArr();
                p2.updateArr();
                break;
            } else if (p1.getPlayerNum() < hiddenNum && p1.getCount() < 10) {
                p1.numberLess();
            } else if (p1.getPlayerNum() > hiddenNum && p1.getCount() < 10) {
                p1.numberGreater();
            } else {
                System.out.println("У " + p1.getName() + " закончились попытки");
                break;
            }

            p2.inputVal();
            p2.Attempts(p2.getPlayerNum());
            if (p2.getPlayerNum() == hiddenNum) {
                p2.playerWin(p2.getPlayerNum());
                System.out.println("Значения игрока " + p1.getName() + ": " + Arrays.toString(p1.arrayAttempts()));
                p1.updateArr();
                p2.updateArr();
                break;
            } else if (p2.getPlayerNum() < hiddenNum && p2.getCount() < 10) {
                p2.numberLess();
            } else if (p2.getPlayerNum() > hiddenNum && p2.getCount() < 10) {
                p2.numberGreater();
            } else {
                System.out.println("У " + p2.getName() + " закончились попытки");
                break;
            }
        } while (true);
    }
}

