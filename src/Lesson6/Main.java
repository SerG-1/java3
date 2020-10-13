package Lesson6;

import Lesson6.Animals.*;

public class Main {
    public static void main(String[] args) {
        //private package-private protected public
        Cat cat = new Cat("Barsik", "red", 2);
        Dog dog = new Dog("Tuzik", "white", 3);




        Animal[] animals = {
                new Cat("Barsik", "red", 2),
                new Dog("Tuzik", "white", 3),

        };

        for (int i = 0; i < animals.length; i++) {
//            animals[i].voice();
            System.out.println(animals[i].toString());
        }

    }
}
