package Lesson6.Animals;

public class Cat extends Animal {
    int liveCount;
    double talonsLength;

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public Cat(String name, String color, int age, int liveCount, double talonsLength) {
        super(name, color, age);
        this.liveCount = liveCount;
        this.talonsLength = talonsLength;
    }


}
