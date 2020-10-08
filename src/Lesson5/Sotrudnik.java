package Lesson5;

public class Sotrudnik {
    private String name;
    private String color;
    private int age;

    public Sotrudnik() {
        this("noname", "white", 1);
    }

    public Sotrudnik(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Sotrudnik(String name) {
        this.name = name;
    }

    public void info() {
        System.out.printf("Cat %s %s %d\n", name, color, age);
    }

    public void jump() {
        System.out.println(name + " jump!");
    }

    public void sleep() {
        System.out.println(name + " sleep...");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст не может быть меньше нуля");
            return;
        }
        this.age = age;
    }
}