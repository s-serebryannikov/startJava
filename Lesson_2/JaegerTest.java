public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger();

        jaeger1.setModelName("Striker Eureka");
        jaeger1.setMark("Mark-5");
        jaeger1.setOrigin("Australia");
        jaeger1.setHeight(250f);
        jaeger1.setWeight(1.85f);
        jaeger1.setSpeed(10);
        jaeger1.setArmor(9);

        jaeger2.setModelName("Crimson Typhoon");
        jaeger2.setMark("Mark-4");
        jaeger2.setOrigin("China");
        jaeger2.setHeight(250f);
        jaeger2.setWeight(1.722f);
        jaeger2.setSpeed(9);
        jaeger2.setArmor(6);

        System.out.println("Jaeger before improvements");

        System.out.println();
        
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
    }
}
