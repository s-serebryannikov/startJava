package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок 1, введите своё имя :");
        Player p1 = new Player(scanner.nextLine(), 10);
        System.out.println("Игрок 2, введите своё имя :");
        Player p2 = new Player(scanner.nextLine(), 10);
        System.out.println("У вас по 10 попыток что бы угадать загаданное слово");
        String answer;
        do {
            GuessNumber game = new GuessNumber(p1, p2);
            game.start();

            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = scanner.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}