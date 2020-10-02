package Lesson3;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {


            int y=1;
            while(y!=0) {
                System.out.println("Угадайте число от 0 до 10");
                int b = random.nextInt(11);
                int j=3;
                for (int i = 0; i <3; i++) {
                    j--;
                    int a = sc.nextInt();
                    if(a<b&&i!=2){
                        System.out.println("Число меньше.Осталось попыток:"+j);
                        }
                        else if(a>b&&i!=2) {
                        System.out.println("Число больше.Осталось попыток:" + j);

                        }
                        else if (a == b&&i!=2) {
                        System.out.println("Поздравляю! Вы угадали число!");
                        System.out.println("1-продолжить/0-выйти");

                        y=sc1.nextInt();
                    }
                    else if(i==2)
                    {
                        System.out.println("Вы проиграли!");
                        System.out.println("1-продолжить/0-выйти");
                        y=sc1.nextInt();
                    }

                }
            }

    }
}
