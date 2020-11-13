package Lesson8;

public class Main {
    public static void main(String[] args){

        String[][] arr = {{"A ", "B ", "C "}, {"D ", "E ", "F "}, {"G ", "H ", "I "}, {"J ", "K ", "L "}};
        test(arr);
                }
    public static void test(String[][] arr1) {


    for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr1[i].length; j++) {

            System.out.print(arr1[i][j]);
        }
        System.out.println();
    }

}

    }

