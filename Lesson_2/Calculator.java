public class Calculator {
    int firstNumber;
    char mathSign;
    int secondNumber;

    public int calculation(int firstNumber, char mathSign, int secondNumber) {
        int result = 0;
        switch (mathSign) {
            case ('+'):
                result = firstNumber + secondNumber;
                break;
            case ('-'):
                result = firstNumber - secondNumber;
                break;
            case ('*'):
                result = firstNumber * secondNumber;
                break;
            case ('/'):
                result = firstNumber / secondNumber;
                break;
            case ('^'):
                result = 1;
                for (int i = 1; i <= secondNumber; i++) {
                    result *= firstNumber;
                }
            case ('%'):
                result = firstNumber % secondNumber;
                break;
        }
        return result;
    }
}