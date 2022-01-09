import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int hiddenNum = 356;
        int playerNum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Загадана цифра от 0 до 100, попробуйте угадать");
        do {
            System.out.println("Введите ваше число:");
            playerNum = scanner.nextInt();
            if (playerNum == hiddenNum) {
                System.out.println("Правильно, загаданное число " + hiddenNum);
            } else {
                System.out.println("Не верно!\n");
                if (playerNum < hiddenNum) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Загаданное число меньше");
                }
                System.out.println("Попробуйте снова");
                System.out.println();
            }
        } while (playerNum != hiddenNum);
    }
}
