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
        System.out.println("Добавлено "+obj.getName()+ " в коробку: "+ i);
        System.out.println("Всего "+obj.getName()+ " в коробке: "+ list.size());
    }
        public void getWeight(T obj){
        float summweight = 0.0f;
        float weight=obj.getWeight();
        summweight=weight*list.size();
        System.out.println("Вес " +obj.getName()+ " в коробке: "+ summweight);

        }

}





