package com.HomeWork6.task3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by DmRG on 07.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = new int[500000];
        Random rn = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(100);
        }

        /*for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println();*/

        int[] array2 = array.clone();
        int[] array3 = array.clone();
        int[] array4 = array.clone();

         long tstart = System.currentTimeMillis();
//        sort(array);
        long tend = System.currentTimeMillis();
        System.out.println((tend - tstart) + " ms" + "- Static method sort");

        tstart = System.currentTimeMillis();
        Multi.sort(array2, 5);
        tend = System.currentTimeMillis();
        System.out.println((tend - tstart) + " ms" + " - MultiThread sort shell ");

        tstart = System.currentTimeMillis();
        Arrays.sort(array3);
        tend = System.currentTimeMillis();
        System.out.println((tend - tstart) + " ms" + " - Array sort");

        tstart = System.currentTimeMillis();
        MultiShell.sort(array4, 5);
        tend = System.currentTimeMillis();
        System.out.println((tend - tstart) + " ms" + " - MultiShell sort 2 release");

      /*  for (int i = 0; i < array4.length; i++) {
            System.out.print(" " + array4[i] + " ");
        }*/
    }

    static void sort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            int k = i - 1;
            temp = array[i];
            for (; k >= 0 && array[k] > temp;) {
                array[k + 1] = array[k];
                array[k] = temp;
                k--;
            }
        }
    }
}
