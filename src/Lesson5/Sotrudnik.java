package Lesson5;

public class Sotrudnik {
    private String fullname;
    private String position;
    private String email;
    private int tel;
    private int paycheck;
    private int age;


    public Sotrudnik(String fullname,String position,String email,int tel,int paycheck,int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.paycheck = paycheck;
        this.age = age;
    }


    public void info() {
        System.out.printf("Sotrudnik %s %s %s %d %d %d\n", fullname, position, email , tel, paycheck, age);
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