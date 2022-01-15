import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок 1, введите своё имя :");
        String playerName1 = scanner.nextLine();
        System.out.println("Игрок 2, введите своё имя :");
        String playerName2 = scanner.nextLine();

        Player p1 = new Player(playerName1);
        Player p2 = new Player(playerName2);
        Random random = new Random();

        do {
            int hiddenNum = random.nextInt(101);
            GuessNumber gn = new GuessNumber(p1, p2, hiddenNum);
            gn.guessNum();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            } while (!answer.equals("yes") & !answer.equals("no"));
            if (answer.equals("no")) break;
        } while (true);
    }
}