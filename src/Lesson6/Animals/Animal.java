package Lesson6.Animals;

public abstract class Animal {
    String name;
    String color;
    int age;


    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.printf("%s %s %d\n", name, color, age);
    }

    public void swim() {
        System.out.println(name + " не умеет плавать!");
    }


}