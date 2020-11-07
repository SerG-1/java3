package Lesson7.HW2;

public class Players {
    private String name;
    private int running;
    private int jumping;

    public Players(String name,int running,int jumping) {
        this.name = name;
        this.running = running;
        this.jumping = jumping;
    }

    public int valuerun(){
        return running;
    }
    public int valuejump(){
        return jumping;
    }
    public void info(){
        System.out.printf("Спортсмен %s,%d,%d\n",name,running,jumping);
    }
    public void jump(){

        System.out.println("Прыгает на "+jumping+" метров");
    }
    public void move(int a,int b) {
        if (this.running <= a && this.jumping <= b) {
            System.out.println("Спортсмен " + this.name + " не прошел испытание");
        } else if(this.running > a && this.jumping > b) {
            System.out.println("Спортсмен " + this.name + " прошел все испытания");
        }
        else if(this.running <=a && this.jumping > b) {
            System.out.println("Спортсмен " + this.name + " прошел все испытания");
        }
    }
}
