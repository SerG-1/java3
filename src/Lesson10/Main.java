package Lesson10;
import java.math.MathContext;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

      /*  final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        long start = System.currentTimeMillis();
        for (int  i = 0; i < size; i++) {

            arr[i] = (float) (Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            arr[i] = (float) (arr[ i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

            System.out.println(i+"   "+arr[i]);
        }

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println(elapsed / 1000+" sec");
    }*/







        long start = System.currentTimeMillis();
        final int size = 10000000;
        final int h = size / 2;

        Thread stream1 = new Thread(() -> {

            float[] arr1 = new float[h];

            for (int i = 0; i < h; i++) {
                arr1[i] = (float)(Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                arr1[i]= (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

                System.out.println(arr1[i]);


               /* try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }



        });






    Thread stream2 = new Thread(() -> {

        float[] arr2 = new float[size];

        for (int i = 5000000; i < size; i++) {
            arr2[i] = (float)(Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            arr2[i]= (float)(arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

            System.out.println("                       " + arr2[i]);

               /* try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
        }
        long finish1 = System.currentTimeMillis();
        long elapsed1 = finish1 - start;
        System.out.println("" + elapsed1 / 1000+" sec");

    });


        stream1.start();
        stream2.start();

        try

    {
        stream1.join();
        stream2.join();
    } catch(
    InterruptedException e)

    {
        e.printStackTrace();
    }
        System.out.println("End");


    }


}
