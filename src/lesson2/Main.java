package lesson2;

public class Main {
    public static void main(String[] args) {

        int mass[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for(int i = 0; i < 10; i++) {
            if (mass[i] == 0) {
                mass[i] = 1;
            } else if (mass[i] == 1) {
                mass[i] = 0;
            }
            System.out.print(mass[i] + " ");
        }

        System.out.println();

        int mass1[] = new int[8];

        for(int j = 0; j < 8; j++) {

            mass1[j]=j*3;
            System.out.print(mass1[j] + " ");
        }

        }




    }






