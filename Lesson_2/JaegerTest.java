public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Striker Eureka", "Mark-5", "Australia", 250f, 1.85f, 10, 9);
        Jaeger jaeger2 = new Jaeger("Crimson Typhoon", "Mark-4", "China", 250f, 1.722f, 9, 6);

        System.out.println("Jaeger before improvements");
        System.out.println("Name Jaeger: " + jaeger1.getModelName() + "\n origin: " + jaeger1.getOrigin() + "\n weight: " + jaeger1.getWeight()
                + "\n armor: " + jaeger1.getArmor());

        System.out.println();

        System.out.println("Name Jaeger: " + jaeger2.getModelName() + "\n origin: " + jaeger2.getOrigin() + "\n weight: " + jaeger2.getWeight()
                + "\n armor: " + jaeger2.getArmor());

        jaeger1.setWeight(2.25f);
        jaeger1.setArmor(10);

        jaeger2.setWeight(2.15f);
        jaeger2.setSpeed(10);
        jaeger2.setArmor(8);

        System.out.println();

        System.out.println("Jaeger after improvements");


        System.out.println("Name Jaeger: " + jaeger1.getModelName() + "\n origin: " + jaeger1.getOrigin() + "\n weight: " + jaeger1.getWeight()
                + "\n armor: " + jaeger1.getArmor());

        System.out.println();

        System.out.println("Name Jaeger: " + jaeger2.getModelName() + "\n origin: " + jaeger2.getOrigin() + "\n weight: " + jaeger2.getWeight()
                + "\n armor: " + jaeger2.getArmor());

        System.out.println();

        jaeger1.runNuclearReactor();
        jaeger1.checkWeapons();
        jaeger1.move();
        System.out.println(jaeger1.scanKaiju());

        System.out.println();

        jaeger2.runNuclearReactor();
        jaeger2.checkWeapons();
        jaeger2.move();
        System.out.println(jaeger2.scanKaiju());
    }
}


