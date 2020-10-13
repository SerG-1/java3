package Lesson6.Animals;

public abstract class Animal {
    String name;
    String color;
    int age;

    public Animal() {
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.printf("%s %s %d\n", name, color, age);
    }
    public void run() {
        System.out.println(name + " jump!");
    }
    public final void swim() {
        System.out.println(name + " sleep...");
    }


}