package Lesson6;

import Lesson6.Animals.*;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", "red", 2);
        Dog dog = new Dog("Tuzik", "white", 3);

        Animal[] animals = {
                new Cat("Barsik", "red", 2),
                new Dog("Tuzik", "white", 3),

        };
        dog.run(50);
        dog.run(501);
        cat.run(50);
        cat.run(251);
        dog.run(-50);
        cat.run(-50);
        cat.swim();
        dog.swim(150);
        dog.swim(-150);
        dog.swim(5);
    }
}
