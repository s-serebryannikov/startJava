import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("������� �������:");
        int age = scanner.nextInt();
        if (age > 20) {
            System.out.println("��� ������ 20 ���");
        }
        System.out.println();

        System.out.println("������� ����:");
        double height = scanner.nextDouble();
        if (height < 180) {
            System.out.println("��� ���� ������ 1.80 �����");
        } else {
            System.out.println("��� ���� ������ 1.80 �����");
        }
        System.out.println();

        System.out.println("������� ������ ����� ������ �����:");
        char firstLetterName = scanner.next().charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("���� ��� ���������� �� �");
        } else if (firstLetterName == 'I') {
            System.out.println("���� ��� ���������� �� I");
        } else {
            System.out.println("���� ��� ���������� �� �� � � I");
        }
        System.out.println();

        System.out.println("������� ��� ��� (male ��� female):");
        char gender = scanner.next().charAt(0);
        if (gender == 'm') {
            System.out.println("�� �������");
        }
        if (gender == 'f') {
            System.out.println("�� �������");
        }
    }
}