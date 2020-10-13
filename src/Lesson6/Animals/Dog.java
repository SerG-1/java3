package Lesson6.Animals;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("Dog " + name + " gav gav!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

