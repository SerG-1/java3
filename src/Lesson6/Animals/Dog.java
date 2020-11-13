package Lesson6.Animals;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    public void swim(int a) {
        if (a>10){
            System.out.println(name + " не может так далеко плавать!");
        }
        else if (a<0){
            System.out.println("Расстояние не может быть отрицательным!" );
        }
        else
        System.out.println(name + " проплыл "+a+" метров");
    }
    public void run(int a) {
        if(a<=500&&a>0) {
            System.out.println(name + " пробежал "+a+" метров");}
        else if (a<0){
            System.out.println("Расстояние не может быть отрицательным!" );
        }
        else
        {System.out.println(name + " не может так далеко бегать!");}
    }

}

