package com.HomeWork9.task1;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by DmRG on 14.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        ArrayList<Integer> arrayList = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(10));
        }
        System.out.println("Создали список и выводим его");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(" " + arrayList.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) { arrayList.remove(i); arrayList.remove(i);}
              if (i == (arrayList.size()-1)) arrayList.remove(i);

        }
        System.out.println("Результат после того как удали первые два елемента и последний:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(" " + arrayList.get(i) + " ");
        }
    }
}
