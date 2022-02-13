package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GuessNumber game = new GuessNumber();
        System.out.println("Игрок 1, введите своё имя :");
        game.save(new Player(scanner.nextLine()));
        System.out.println("Игрок 2, введите своё имя :");
        game.save(new Player(scanner.nextLine()));
        System.out.println("Игрок 3, введите своё имя :");
        game.save(new Player(scanner.nextLine()));
        System.out.println("У вас по 10 попыток что бы угадать загаданное слово");
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scanner.next();
        } while (!answer.equals("no"));
    }
}