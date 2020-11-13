package Lesson9.HW1;

import java.util.*;


public class Main {
    public static void main(String[] args) {


        String[] ar = {"Декламатор", "Индейский", "Крикнуть", "Папа", "Пройти", "Папа","Пройти","Пройти","Просачиваться","Индейский"};
        Map<String, Integer> map = new HashMap<>();

        for (String s : ar) {
            if ((map.get(s)) == null) {
                System.out.print(s+" ");
                map.put(s, 1);
            } else {
                map.put(s, (map.get(s) + 1));
            }
        }
        System.out.print("\n");
        System.out.println(map);
    }}









