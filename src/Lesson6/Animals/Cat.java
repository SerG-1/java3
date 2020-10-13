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

    public void run(int a) {
        if(a<=200)
        System.out.println(name + " пробежал "+a+" метров");
        else
        {System.out.println(name + " не может так далеко бегать!");}
    }


}
