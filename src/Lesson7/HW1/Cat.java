package Lesson7.HW1;

public class Cat implements RunJump {
    @Override
    public void RJ() {

        System.out.println(Cat.class.getSimpleName()+" умеет бегать и прыгать");
    }
}
