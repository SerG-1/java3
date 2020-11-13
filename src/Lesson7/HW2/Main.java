package Lesson7.HW2;



public class Main {
    public static void main(String[] args){
        //Players player = new Players("Alex",151,3);
       // Players player1 = new Players("Dmitry",20,1);
        Track track = new Track(150);
        Wall heigh = new Wall(2);
        Players player[] = {
                new Players("Nikolay", 250, 1),
                new Players("Sergey", 1, 3 ),
                new Players("Alex",151,3),
                new Players("Dmitry",20,1),

        };
        
    for(int i=0;i<player.length;i++) {
    player[i].move(track.disstantion, heigh.height);
    }

    }

}
