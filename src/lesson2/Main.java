package lesson2;

public class Main {
    public static void main(String[] args) {

        mass();
        System.out.println();
        mass1();
        System.out.println();
        mass2();
        System.out.println();
        System.out.println();
        mass3();
    }
        public static void mass(){
            int a[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < 10; i++) {
                if (a[i] == 0) {
                    a[i] = 1;
                } else if (a[i] == 1) {
                    a[i] = 0;
                }
                System.out.print(a[i] + " ");
            }

        }

        public static void mass1() {
            int a[] = new int[8];

            for(int i = 0; i < 8; i++) {

                a[i]=i*3;
                System.out.print(a[i] + " ");
            }

    }
        public static void mass2() {
            int a[] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < a.length; i++) {
                if (a[i] < 6) {
                    a[i] = a[i]*2;
                }
                System.out.print(a[i] + " ");
            }

    }
        public static void mass3() {
            int counter = 1;
            int[][] a = new int[8][8];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = 0;

                    if(i==j||i==(a.length-1)-j&&j==(a.length-1)-i)
                        a[i][j]=1;

                        System.out.print(a[i][j]+"   ");
                    }
                System.out.println();
                }

            }


        }








