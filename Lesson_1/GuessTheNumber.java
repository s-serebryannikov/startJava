import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int hiddenNum = 356;
        int numUser;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Загадана цифра от 0 до 100, попробуйте угадать");
        do {
            System.out.println("Введите ваше число:");
            numUser = scanner.nextInt();
            if (numUser == hiddenNum) {
                System.out.println("Правильно, загаданное число " + hiddenNum);
            } else {
                System.out.println("Не верно!");
                System.out.println();
                if (numUser < hiddenNum) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Загаданное число меньше");
                }
                System.out.println("Попробуйте снова");
                System.out.println();
            }
        } while (numUser != hiddenNum);
    }
}
