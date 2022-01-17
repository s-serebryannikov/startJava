package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int firstNumber;
    private char mathSign;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public char getMathSign() {
        return mathSign;
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void calculate() {
        int result = 0;
        switch (mathSign) {
            case '+':
                result = firstNumber + secondNumber;
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
                result = 1;
                for (int i = 1; i <= secondNumber; i++) {
                    result *= firstNumber;
                }
            case '%':
                result = firstNumber % secondNumber;
                break;
            default:
                System.out.println("Такой оператор не найден");
        }
        System.out.println("Результат вычисления " + result);
    }
}