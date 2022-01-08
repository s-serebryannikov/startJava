import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        System.out.println("Введите рост:");
        double height = scanner.nextDouble();
        System.out.println("Введите первую букву вашего имени:");
        char firstLetterName = scanner.next().charAt(0);
        boolean male = true;
        if (age > 20) {
            System.out.println("Вам больше 20 лет");
        }
        if (male) {
            System.out.println("Вы мужчина");
        }
        if (!male) {
            System.out.println("Вы женщина");
        }
        if (height < 180) {
            System.out.println("Ваш рост меньше 1.80 метра");
        } else {
            System.out.println("Ваш рост больше 1.80 метра");
        }

        if (firstLetterName == 'M') {
            System.out.println("Ваше имя начинается на М");
        } else if (firstLetterName == 'I') {
            System.out.println("Ваше имя начинается на I");
        } else {
            System.out.println("Ваше имя начинается не на М и I");
        }
    }
}
