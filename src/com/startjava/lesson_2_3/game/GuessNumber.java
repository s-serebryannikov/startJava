package com.startjava.lesson_2_3.game;

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
            System.out.println("\nИгрок " + p1.getName() + " попробуйте угадать число: ");
            playerNumber = scanner.nextInt();
            if (playerNumber == hiddenNum) {
                System.out.println("\nИгрок " + p1.getName() + " вы победили!");
                break;
            } else if (playerNumber < hiddenNum) {
                System.out.println("\nИгрок " + p1.getName() + ", данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("\nИгрок " + p1.getName() + ", данное число больше того, что загадал компьютер");
            }

            System.out.println("\nИгрок " + p2.getName() + " попробуйте угадать число: ");
            playerNumber = scanner.nextInt();
            if (playerNumber == hiddenNum) {
                System.out.println("\nИгрок " + p2.getName() + " вы победили!");
                break;
            } else if (playerNumber < hiddenNum) {
                System.out.println("\nИгрок " + p2.getName() + ", данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("\nИгрок " + p2.getName() + ", данное число больше того, что загадал компьютер");
            }
        } while (true);
    }
}

