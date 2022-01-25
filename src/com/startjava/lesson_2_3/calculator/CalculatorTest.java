package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Введите математическое выражение: ");
            String[] str = scanner.nextLine().split(" ");

            calc.setFirstNumber(parseInt(str[0]));
            calc.setMathSign(str[1].charAt(0));
            calc.setSecondNumber(parseInt(str[2]));

            System.out.println("Результат " + calc.calculate());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") & !answer.equals("no"));
        } while (!answer.equals("no"));

    }
}