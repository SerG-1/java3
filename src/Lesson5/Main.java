package Lesson5;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Sotrudnik Sotrudnik1 = new Sotrudnik("Akakiyev Akakiy Akakiyevich", "manager", "akakiy@ya.ru",88000000 ,13000, 40);

       Sotrudnik1.info();
       System.out.println();



          Sotrudnik[] Sotrudnik = new Sotrudnik[5];
          Sotrudnik[0] = new Sotrudnik("Volkov Alfred Borisovich", "teamlider", "volkov@ya.ru", 88000000,30000,40);
          Sotrudnik[1] = new Sotrudnik("Nikiforov Kirill Georgievich", "manager", "nikiforov@ya.ru", 88100000,25000,35);
          Sotrudnik[2] = new Sotrudnik("Gerasimov Lyubomir Frolovich", "konstruktor", "gerasimov@ya.ru", 88200000,39000, 41);
          Sotrudnik[3] = new Sotrudnik("Suvorov Ivan Alvianovich", "ingeneer", "suvorov@ya.ru", 88300000,28000,32);
          Sotrudnik[4] = new Sotrudnik("Terentev Guriy Anatolievich", "direktor", "terentev@ya.ru", 88400000,1000000,20);

        for (int i = 0; i < Sotrudnik.length; i++) {

            Sotrudnik[i].info();

        }
        System.out.println();

          for (int i = 0; i < Sotrudnik.length; i++) {

             if (Sotrudnik[i].old()>40)
             {
                 System.out.println("Sotrudnik starshe 40");
                 Sotrudnik[i].info();
              }

        }

    }
}