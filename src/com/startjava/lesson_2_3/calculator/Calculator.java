package com.startjava.lesson_2_3.calculator;


import static java.lang.Integer.parseInt;

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

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getMathSign() {
        return mathSign;
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public int calculate() {
        int result = 0;
        switch (mathSign) {
            case '+':
                result = Math.addExact(firstNumber,secondNumber);
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