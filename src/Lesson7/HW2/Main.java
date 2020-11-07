package Lesson7.HW2;

public class Main {
    public static void main(String[] args){
        Players player = new Players("Alex",151,3);
        Players player1 = new Players("Dmitry",20,1);
        Track track = new Track(150);
        Wall heigh = new Wall(2);


        player1.move(track.disstantion,heigh.height);
        player.move(track.disstantion,heigh.height);

    }

}
