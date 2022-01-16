import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок 1, введите своё имя :");
        Player p1 = new Player(scanner.nextLine());
        System.out.println("Игрок 2, введите своё имя :");
        Player p2 = new Player(scanner.nextLine());

        do {
            GuessNumber gn = new GuessNumber(p1, p2);
            gn.startGame();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            } while (!answer.equals("yes") & !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}