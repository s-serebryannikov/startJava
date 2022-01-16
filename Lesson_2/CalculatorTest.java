import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Введите первое число: ");
            calc.setFirstNumber(scanner.nextInt());
            System.out.println("Введите символ математические операции (+, -, *, /, ^, %): ");
            calc.setMathSign(scanner.next().charAt(0));
            System.out.println("Введите второе число: ");
            calc.setSecondNumber(scanner.nextInt());

            calc.calculate();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            } while (!answer.equals("yes") & !answer.equals("no"));
            if (answer.equals("no")) break;
        } while (true);
    }
}