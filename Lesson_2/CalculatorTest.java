import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        calc.firstNumber = scanner.nextInt();
        System.out.println("Введите символ математические операции (+, -, *, /, ^, %): ");
        calc.mathSign = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        calc.secondNumber = scanner.nextInt();

        System.out.println(calc.calculation(calc.firstNumber, calc.mathSign, calc.secondNumber));
    }
}