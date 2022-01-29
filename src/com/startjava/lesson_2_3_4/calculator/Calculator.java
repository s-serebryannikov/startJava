package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Calculator {

    public static void calculate(String mathExpression) {
        if (parseDouble(mathExpression.split(" ")[0]) % 1 == 0 & parseDouble(mathExpression.split(" ")[0]) > 0
                & parseDouble(mathExpression.split(" ")[2]) % 1 == 0 & parseDouble(mathExpression.split(" ")[2]) > 0) {
            int firstNumber = Integer.parseInt(mathExpression.split(" ")[0]);
            char mathSign = mathExpression.split(" ")[1].charAt(0);
            int secondNumber = Integer.parseInt(mathExpression.split(" ")[2]);
            int math = switch (mathSign) {
                case '+' -> Math.addExact(firstNumber, secondNumber);
                case '-' -> firstNumber - secondNumber;
                case '*' -> firstNumber * secondNumber;
                case '/' -> firstNumber / secondNumber;
                case '^' -> (int) Math.pow(firstNumber, secondNumber);
                case '%' -> firstNumber % secondNumber;
                default -> 0;
            };
            System.out.println("Результат вычисления: " + math);
        } else {
            System.out.println("Не корректные значения\nВведите значения ещё раз");
            System.out.println("Введите математическое выражение: ");
            Scanner scanner = new Scanner(System.in);
            Calculator.calculate(scanner.nextLine());
        }
    }
}


