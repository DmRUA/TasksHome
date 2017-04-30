package com.HomeWork6.task2;

import java.math.BigInteger;
import java.util.Random;

/**
 * Created by DmRG on 03.02.2017.
 */
public class SingleSumCalculation implements Runnable {
    private int[] array;
    private int begin;
    private int end;
    private Thread thr;
    private long sum;

    public SingleSumCalculation(int[] array, int begin, int end) {
        super();
        this.array = array;
        this.begin = begin;
        this.end = end;
        thr = new Thread (this);
        thr.start();
        this.sum = 0;
    }

    public long getSum() {
        return sum;
    }

    public Thread getThr() {
        return thr;
    }

    @Override
    public void run() {
        for (int i = begin; i < end ; i++) {
            sum = sum + array[i];
        }
    }

}
