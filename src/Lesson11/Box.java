package Lesson11;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<T> {
private T obj;
    List list = new ArrayList();
    public Box(T obj) {
        this.obj = obj;

    }

    public T getObj() {
        return obj;
    }
    public void add(int kol,T obj){
            int i=0;
            while(i<kol) {
                i++;
                list.add(obj);
            }
        System.out.println("Добавлено фруктов: " +i);
        System.out.println("Всего фруктов: " + list.size());


    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}



