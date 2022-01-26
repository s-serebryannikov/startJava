package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        backToBeginning:
        do {
            System.out.println("Введите математическое выражение: ");
            Calculator.mathExpression = scanner.nextLine();

            if (parseInt(Calculator.mathExpression.split(" ")[0]) <= 0 && parseInt(Calculator.mathExpression.split(" ")[0]) % 2 != 1
                    || parseInt(Calculator.mathExpression.split(" ")[2]) <= 0 && parseInt(Calculator.mathExpression.split(" ")[2]) % 2 != 1) {
                System.out.println("Не корректные данные\nТребуются целые и положительные числа\n");
                continue backToBeginning;
            } else System.out.println("Результат вычисления " + Calculator.calculate());

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") & !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}