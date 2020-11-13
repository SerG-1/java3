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


    public void move(int a,int b) {
        if (this.running <= a && this.jumping <= b) {
            System.out.println("Спортсмен " + this.name + " не прошел испытание, не пробежал "+a+" метров и не перепрыгнул препятствие "+b+" метра");
        }
        else if(this.running > a && this.jumping > b) {
            System.out.println("Спортсмен " + this.name + " прошел все испытания, пробежал "+a+" метров и перепрыгнул препятствие "+b+" метра");
        }
        else if(this.running <=a && this.jumping > b) {
            System.out.println("Спортсмен " + this.name + " не пробежал "+a+" метров, но в итоге перепрыгнул препятствие высотой "+b+" метра , отдельно от прбежки");
        }
        if (this.running >a && this.jumping <= b) {
            System.out.println("Спортсмен " + this.name + " пробежал "+a+" метров, но не перепрыгнул препятствие высотой "+b+" метра");
        }

    }
}
