package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Введите математическое выражение: ");
            calc.setMathExpression(scanner.nextLine());
            System.out.println("Результат " + calc.calculate());

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") & !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}