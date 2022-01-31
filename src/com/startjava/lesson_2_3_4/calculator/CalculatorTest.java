package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        System.out.println("Введите математическое выражение: ");
        System.out.println("Результат вычисления " + Calculator.calculate(scanner.nextLine()));
        do {
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = scanner.nextLine();
            if (answer.equals("yes")) {
                System.out.println("Введите математическое выражение: ");
                System.out.println("Результат вычисления " + Calculator.calculate(scanner.nextLine()));
            }
        } while (!answer.equals("no"));
    }
}