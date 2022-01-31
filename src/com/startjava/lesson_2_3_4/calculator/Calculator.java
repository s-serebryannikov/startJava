package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Calculator {

    public static int calculate(String mathExpression) {
        String[] mathExp = mathExpression.split(" ");
        if (parseDouble(mathExp[0]) % 1 == 0 & parseDouble(mathExp[0]) > 0
                & parseDouble(mathExp[2]) % 1 == 0 & parseDouble(mathExp[2]) > 0) {
            int firstNumber = Integer.parseInt(mathExp[0]);
            char mathSign = mathExp[1].charAt(0);
            int secondNumber = Integer.parseInt(mathExp[2]);
            return switch (mathSign) {
                case '+' -> Math.addExact(firstNumber, secondNumber);
                case '-' -> firstNumber - secondNumber;
                case '*' -> firstNumber * secondNumber;
                case '/' -> firstNumber / secondNumber;
                case '^' -> (int) Math.pow(firstNumber, secondNumber);
                case '%' -> firstNumber % secondNumber;
                default -> 0;
            };
        } else {
            System.out.println("Не корректные значения\nВведите значения ещё раз");
            System.out.println("Введите математическое выражение: ");
            Scanner scanner = new Scanner(System.in);
            Calculator.calculate(scanner.nextLine());
        }
        return 0;
    }
}


