import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;


    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number;
        int hiddenNum = random.nextInt(100) + 1;
        do {
            System.out.println("Игрок " + p1.getName() + " попробуйте угадать число: ");
            number = scanner.nextInt();
            if (number == hiddenNum) {
                System.out.println("Игрок " + p1.getName() + " вы победили!");
                break;
            } else if (number <= hiddenNum) {
                System.out.println("Игрок " + p1.getName() + ", данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Игрок " + p1.getName() + ", данное число больше того, что загадал компьютер");
            }
            System.out.println();

            System.out.println("Игрок " + p2.getName() + " попробуйте угадать число: ");
            number = scanner.nextInt();
            if (number == hiddenNum) {
                System.out.println("Игрок " + p2.getName() + " вы победили!");
                break;
            } else if (number < hiddenNum) {
                System.out.println("Игрок " + p2.getName() + ", данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Игрок " + p2.getName() + ", данное число больше того, что загадал компьютер");
                System.out.println();
            }
        } while (number != hiddenNum);
    }
}