package com.HomeWork6.task2;

import java.util.Random;

/**
 * Created by DmRG on 03.02.2017.
 */
public class MainTask2 {
    public static void main(String[] args) {

        int[] array = new int[90000000];
        Random rn = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(20);
        }
        long tstart = System.currentTimeMillis();
        System.out.println("Static method sum: " + sumThearray(array));
        long tend = System.currentTimeMillis();
        System.out.println((tend - tstart) + " ms" + "- Static method sort");

        long tstart1 = System.currentTimeMillis();
        MultiThreadCalculation mtc = new MultiThreadCalculation();
        System.out.println("Multi thread sum: " + mtc.sum(array, 2));
        long tend1 = System.currentTimeMillis();
        System.out.println((tend1 - tstart1) + " ms" + "- Multi Thread method sort");
        System.out.println();

    }

    public static long sumThearray(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        return sum;
    }
}
