package lesson1;

public class Main {
 public static void main(String[] args){
     System.out.println("Hello world!");
     byte val = -120;
     short val1 = 12442;
     int val2 = 1000;
     long val3 = 200000L;
     float val4 = 12.23f;
     double val5 = -123.123;
     char val6 = 1;
     boolean val7 = false;
     System.out.println(val);
     System.out.println(val1);
     System.out.println(val2);
     System.out.println(val3);
     System.out.println(val4);
     System.out.println(val5);
     System.out.println(val6);
     System.out.println(val7);

     System.out.println("Summ="+summ(333,1,1,1));

     trues(15,0);

     plusormin(+100500);

     System.out.println(znak());

     name("SERG");

     visok(2900);

 }
    public static int summ(int a, int b, int c, int d ) {
        return a*(b+(c/d));}

    public static void trues(int a, int b) {
       int c=a+b;
        if(c>=10&&c<=20)
        {System.out.println("true");}
        else
        {System.out.println("false");}
        }
    public static void plusormin(int a){
     if(a<0){
         System.out.println("отрицательное");
     }
     else if(a>=0)
     {
         System.out.println("положительное");
     }
    }
     public static boolean znak() {
     int a=0;
        if (a<0)
        {return true;}
       return false;
    }
    public static void name(String name) {
        System.out.println("Привет,"+name+"!");

    }
    public static void visok(int a) {
        int b;
        if (a % 400 == 0||a % 4==0&&a % 100!=0) {
            System.out.println("Год високосный!");
        }
        else
        {System.out.println("Год не високосный!");}
    }

}
