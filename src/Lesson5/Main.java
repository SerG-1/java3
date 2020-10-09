package Lesson5;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Sotrudnik Sotrudnik1 = new Sotrudnik("Akakiyev Akakiy Akakiyevich", "manager", "akakiy@ya.ru",88000000 ,13000, 40);

       Sotrudnik1.info();



          Sotrudnik[] Sotrudnik = new Sotrudnik[4];
          Sotrudnik[0] = new Sotrudnik("Volkov Alfred Borisovich", "teamlider", "volkov@ya.ru", 88000000,30000,40);
          Sotrudnik[1] = new Sotrudnik("Nikiforov Kirill Georgievich", "manager", "nikiforov@ya.ru", 88100000,25000,35);
          Sotrudnik[2] = new Sotrudnik("Gerasimov Lyubomir Frolovich", "konstruktor", "gerasimov@ya.ru", 88200000,39000, 40);
          Sotrudnik[3] = new Sotrudnik("Suvorov Ivan Alvianovich", "ingeneer", "suvorov@ya.ru", 88300000,28000,32);
          Sotrudnik[4] = new Sotrudnik("Terentev Guriy Anatolievich", "direktor", "terentev@ya.ru", 88400000,1000000,20);

//        Cat[] cats = {
//                new Cat("Barsik", "white", 3),
//                new Cat("Bk", "w", 3),
//                new Cat("ik", "e", 4),
//        };
//
//
//        for (int i = 0; i < cats.length; i++) {
//            cats[i].info();
//            cats[i].sleep();
//        }

//        for (Cat cat : cats) {
//            cat.info();
//        }


//        System.out.println(Math.pow(2,3));
//        System.out.println(Math.max(6,99));
//        System.out.println(Math.abs(-7.9));
////        System.out.println(Math.addExact(2000000000,2000000000));
//        System.out.println(2000000000+2000000000);
//        System.out.println(Math.cbrt(27));
//        System.out.println(Math.sqrt(16));
//        System.out.println(Math.floor(-6.9));
//        System.out.println(Math.ceil(-8.001));
//        System.out.println(Math.rint(-4.3));
//        System.out.println(Math.round(-4.3));

//        String s = "java_core_897$68$97_7567";
//        String formatted = String.format("qwerty %s %.02f %d %c",s, 0.97, 777, 'A' );
//        System.out.println(formatted);

//        String s1 =s.replaceAll("_", "+");
//        String s1 =s.replaceAll("\\d+", "*");
//        String s1 =s.replaceAll("\\W+", "*");
//        String s1 =s.replaceAll("\\$", "*").replaceAll("_","*");
//        System.out.println(s1);

//        String[] words = s.split("_");
//        System.out.println(Arrays.toString(words));

//        s = s.toUpperCase();
//        System.out.println(s);

//        int
//       Integer
//        char
//       Character



    }
}