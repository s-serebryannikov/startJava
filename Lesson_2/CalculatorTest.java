import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        char answer;
        for (; ; ) {
            do {

                System.out.println("Введите первое число: ");
                calc.firstNumber = scanner.nextInt();
                System.out.println("Введите символ математические операции (+, -, *, /, ^, %): ");
                calc.mathSign = scanner.next().charAt(0);
                System.out.println("Введите второе число: ");
                calc.secondNumber = scanner.nextInt();

                calc.calculation(calc.firstNumber, calc.mathSign, calc.secondNumber);
                do {
                    System.out.println("Хотите продолжить вычисления? [yes/no]:");
                    answer = scanner.next().charAt(0);
                } while (answer != 'n' & answer != 'y');
            } while (answer != 'n');
            if (answer == 'n') break;

        }
    }
}