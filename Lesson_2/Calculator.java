public class Calculator {
    private int firstNumber;
    private char mathSign;
    private int secondNumber;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public char getMathSign() {
        return mathSign;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void calculate(int firstNumber, char mathSign, int secondNumber) {
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