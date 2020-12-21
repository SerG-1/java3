package Lesson11;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {




    public static void main(String[] args) {
        Box<Orange> box = new Box<>(new Orange());
        Box<Apple> box1 = new Box<>(new Apple());
        box.add(5,new Orange());
        box.add(5,new Orange());
      /*  List<Orange> list = new ArrayList<>();
        list.add(new Orange());
        list.add(new Orange());
        list.add(new Orange());
        list.add(new Orange());
        System.out.println(list.size());*/


        /*Orange frukt=box.getObj();
        frukt.name();
        Apple frukt1=box1.getObj();
        frukt1.name();*/
    }

}
