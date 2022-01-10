public class WolfTest{
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();

        wolf1.gender = "male";
        wolf1.name = "Tim";
        wolf1.weight = 25;
        wolf1.age = 7;
        wolf1.color = "White";

        System.out.println("Имя: " + wolf1.name);
        System.out.println("Пол: " + wolf1.gender);
        System.out.println("Возраст: " + wolf1.age);
        System.out.println("Вес: " + wolf1.weight);
        System.out.println("Цвет: " + wolf1.color);

        wolf1.go();
        wolf1.run();
        wolf1.sit();
        wolf1.howling();
        wolf1.hunting();
    }
}