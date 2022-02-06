package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    CalculatorTest c = new CalculatorTest();

    public static int calculate(String mathExpression) throws Exception {
        String[] mathExp = mathExpression.split(" ");

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
            default -> throw new NumberFormatException("Допустимый знак математической операции: \"+ - * / ^ %\"");
        };
    }
}





