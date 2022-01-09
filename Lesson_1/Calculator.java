import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите символ математические операции (+, -, *, /, ^, %): ");
        char mathSign = scanner.next().charAt(0);
        int result = 0;
        
        if (mathSign == '+') {
            result = firstNumber + secondNumber;
        } else if (mathSign == '-') {
            result = firstNumber - secondNumber;
        } else if (mathSign == '*') {
            result = firstNumber * secondNumber;
        } else if (mathSign == '/') {
            result = firstNumber / secondNumber;
        } else if (mathSign == '^') {
            result = 1;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
        } else if(mathSign == '%') {
            result = firstNumber % secondNumber;
        }
        System.out.println(result);
    }
}