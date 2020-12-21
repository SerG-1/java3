package Lesson11;

import java.util.List;

public class Orange extends Fruits {

    public void name(){
        System.out.println("Мандарин");
    }
    float weight() {
        return 1.5f;
    }

    @Override
    float getWeight() {
        return 0;
    }
}
