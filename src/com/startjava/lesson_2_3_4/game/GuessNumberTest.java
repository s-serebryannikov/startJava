package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        Player[] players = new Player[3];
        for (int i = 0; i < players.length; i++) {
            System.out.println("Игрок " + (i + 1) + ", введите своё имя :");
            players[i] = new Player(scanner.nextLine());
        }
        GuessNumber game = new GuessNumber(players);

        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scanner.next();
        } while (!answer.equals("no"));
    }
}