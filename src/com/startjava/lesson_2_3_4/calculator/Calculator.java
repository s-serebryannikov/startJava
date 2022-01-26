package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Integer.parseInt;

public class Calculator {

    public static String mathExpression;

    public static int calculate() {
        int firstNumber = parseInt(mathExpression.split(" ")[0]);
        char mathSign = mathExpression.split(" ")[1].charAt(0);
        int secondNumber = parseInt(mathExpression.split(" ")[2]);
        return switch (mathSign) {
            case '+' -> Math.addExact(firstNumber, secondNumber);
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            case '/' -> firstNumber / secondNumber;
            case '^' -> (int) Math.pow(firstNumber, secondNumber);
            case '%' -> firstNumber % secondNumber;
            default -> 0;
        };
    }
}