package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        GuessNumber game = new GuessNumber(new Player[3]);

        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scanner.next();
        } while (!answer.equals("no"));
    }
}