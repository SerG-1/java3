package Lesson11;

public class Apple extends Fruits {

    public void name(){
        System.out.println("Яблоко");
    }
    float weight() {
        return 1.0f;
    }

    @Override
    float getWeight() {
        return 0;
    }
}
