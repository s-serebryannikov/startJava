package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Integer.parseInt;

public class Calculator {
    private int firstNumber;
    private char mathSign;
    private int secondNumber;
    private String mathExpression;

    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public int calculate() {
        int result = 0;
        firstNumber = parseInt(mathExpression.split(" ")[0]);
        mathSign = mathExpression.split(" ")[1].charAt(0);
        secondNumber = parseInt(mathExpression.split(" ")[2]);
        switch (mathSign) {
            case '+':
                result = Math.addExact(firstNumber, secondNumber);
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '^':
                result = (int) Math.pow(firstNumber, secondNumber);
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            default:
                System.out.println("Такой оператор не найден");
        }
        return result;
    }
}