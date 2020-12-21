package Lesson1_3;

public class App {
    public static void main(String[] args) {
        Apple apple = new Apple(1.0);
        Orange orange = new Orange(1.2);
        Box<Apple> box1 = new Box();
        Box<Orange> box2 = new Box();

        for (int i = 0; i < 5; i++) {
            box1.add(apple);
        }
        System.out.println("В коробке 1: " + box1.getWeight() + "  у.е.");

        for (int i = 0; i < 5; i++) {
            box2.add(orange);
        }
        System.out.println("В коробке 2: " + box2.getWeight() + "  у.е.");

        System.out.println("равентство: " + box1.compare(box2));

        System.out.println("\n Добавим яблоко в первую коробку: ");

        box1.add(apple);
        System.out.println("В коробке 1: " + box1.getWeight() + "  у.е.");
        System.out.println("равентство: " + box1.compare(box2));
        System.out.println("\n Заполним коробку 3 яблоками ....");
        Box<Apple> box3 = new Box<Apple>();
        for (int i = 0; i < 10; i++) {
            box3.add(apple);
        }
        System.out.println("В коробке 3: " + box3.getWeight() + "  у.е.");
        System.out.println(" \n.....и пересыпем в коробку 1:");

        box1.reLoad(box3);
        System.out.println("В коробке 1: " + box1.getWeight() + "  у.е.");
        System.out.println("В коробке 3: " + box3.getWeight() + "  у.е.");
        System.out.println("равентство: " + box1.compare(box2));


    }
}
