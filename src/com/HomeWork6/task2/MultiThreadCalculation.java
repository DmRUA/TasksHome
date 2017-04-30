package com.HomeWork6.task2;

import java.util.Random;

/**
 * Created by DmRG on 03.02.2017.
 */
public class MultiThreadCalculation {

    public long sum(int[] array, int threadNumber) {
        SingleSumCalculation[] ssc = new SingleSumCalculation[threadNumber];
        for (int i = 0; i < ssc.length; i++) {
            int size = array.length / threadNumber;
            int begin = size * i;
            int end = ((i + 1) * size);
            if ((array.length - end) < size) {
                end = array.length;
            }
            ssc[i] = new SingleSumCalculation(array, begin, end);
        }
        for (int i = 0; i < ssc.length; i++) {
            try {
                ssc[i].getThr().join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        return arrSumAll(ssc);
    }

        public long arrSumAll(SingleSumCalculation[] ssc){
            long sum = 0;
            for (int i = 0; i < ssc.length; i++) {
                sum =sum + ssc[i].getSum();
            }
            return sum;
    }
}
