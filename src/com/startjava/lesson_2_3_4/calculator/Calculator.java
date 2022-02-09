package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Double.parseDouble;

public class Calculator {
    public static int calculate(String mathExpression) {
        String[] mathExp = mathExpression.split(" ");
        int firstNumber = 0;
        int secondNumber = 0;
        char mathSign = mathExp[1].charAt(0);

        if (checkInteger(mathExp[0], mathExp[2])) {
            firstNumber = Integer.parseInt(mathExp[0]);
            secondNumber = Integer.parseInt(mathExp[2]);
        } else {
            System.out.println("Числа должны быть целые и положительные");
        }

        return switch (mathSign) {
            case '+' -> Math.addExact(firstNumber, secondNumber);
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            case '/' -> firstNumber / secondNumber;
            case '^' -> (int) Math.pow(firstNumber, secondNumber);
            case '%' -> firstNumber % secondNumber;
            default -> throw new NumberFormatException();
        };
    }

    private static boolean checkInteger(String firstnum, String secondnum) {
        return parseDouble(firstnum) % 1 == 0 && parseDouble(secondnum) % 1 == 0 && parseDouble(firstnum) > 0 && parseDouble(secondnum) > 0;
    }
}