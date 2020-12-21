package Lesson11;

public class Apple extends Fruits {

    public void name(){
        System.out.println("Яблоко");
    }
    @Override
    float getWeight() {
        return 1.0f;
    }

    @Override
    String getName() {
        return "Яблок";
    }


}
