package demo_override;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng từ class Animal
//        Animal animal = new Animal();
//        animal.eat();
//        animal.sound();
//
//        // Tạo đối tượng từ class Dog
//        Dog dog = new Dog();
//        dog.eat();
//        dog.sound();
//        dog.sleep();
//
//        // Tạo đối tượng từ class cat
//        Cat cat = new Cat();
//        cat.eat();
//        cat.sound();
//        cat.play();

        // Upcasting
        // Ép kiểu không tường minh
        Animal animal = new Dog();

        // Ép kiểu tường minh
//        Animal animal = (Animal) new Dog();

        animal.eat();
        animal.sound();

        // Khởi tạo đối tượng từ lớp Cat
        Animal animal1 = new Cat();
        animal1.eat();
        animal1.sound();

        // Khởi tạo danh sách động vật
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());

        System.out.println("**************");

        for (Animal animal2: animals) {
            animal2.eat();
            animal2.sound();
            System.out.println();
        }

        // Downcasting
        Dog dog = (Dog) animal;
        dog.eat();
        dog.sound();
        dog.sleep();

        Cat cat = (Cat) animal1;
        cat.eat();
        cat.sound();
        cat.play();
    }
}
