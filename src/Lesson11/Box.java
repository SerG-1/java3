package Lesson11;
import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruits> {
    List<T> list = new ArrayList();
    public void add(int kol, T obj) {
        int i = 0;
        while (i < kol) {
            i++;
            list.add(obj);
        }
        System.out.println("Добавлено фруктов: " + i);
        System.out.println("Всего фруктов: " + list.size());
    }
    public void getWeight(T obj){


        }
    }




