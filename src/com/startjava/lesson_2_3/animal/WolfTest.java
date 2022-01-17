package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setGender("male");
        wolf.setName("Tim");
        wolf.setWeight(25);
        wolf.setAge(9);
        wolf.setColor("White");

        System.out.println("Имя: " + wolf.getName());
        System.out.println("Пол: " + wolf.getGender());
        System.out.println("Возраст: " + wolf.getAge());
        System.out.println("Вес: " + wolf.getWeight());
        System.out.println("Цвет: " + wolf.getColor());
        System.out.println();

        wolf.go();
        wolf.run();
        wolf.sit();
        wolf.howl();
        wolf.hunt();
    }
}