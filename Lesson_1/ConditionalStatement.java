import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        if (age > 20) {
            System.out.println("Вам больше 20 лет");
        }
        System.out.println();

        System.out.println("Введите рост:");
        double height = scanner.nextDouble();
        if (height < 180) {
            System.out.println("Ваш рост меньше 1.80 метра");
        } else {
            System.out.println("Ваш рост больше 1.80 метра");
        }
        System.out.println();

        System.out.println("Введите первую букву вашего имени:");
        char firstLetterName = scanner.next().charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Ваше имя начинается на М");
        } else if (firstLetterName == 'I') {
            System.out.println("Ваше имя начинается на I");
        } else {
            System.out.println("Ваше имя начинается не на М и I");
        }
        System.out.println();

        System.out.println("Введите ваш пол (male или female):");
        char gender = scanner.next().charAt(0);
        if (gender == 'm') {
            System.out.println("Вы мужчина");
        }
        if (gender == 'f') {
            System.out.println("Вы женщина");
        }
    }
}