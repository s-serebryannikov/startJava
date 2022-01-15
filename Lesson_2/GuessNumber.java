import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;
    int number;
    int hiddenNum;

    public GuessNumber(Player p1, Player p2, int hiddenNum) {
        this.p1 = p1;
        this.p2 = p2;
        this.hiddenNum = hiddenNum;
    }

    Scanner scanner = new Scanner(System.in);

    void guessNum() {
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
            } else if (number <= hiddenNum) {
                System.out.println("Игрок " + p2.getName() + ", данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Игрок " + p2.getName() + ", данное число больше того, что загадал компьютер");
                System.out.println();
            }
        } while (number != hiddenNum);
    }
}
