package com.HomeWork6;

import java.math.BigInteger;

/**
 * Created by DmRG on 03.02.2017.
 */
public class NewThread implements Runnable {
    private int number;

    public NewThread() {
    }

    public NewThread(int number) {
        super();
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private BigInteger getFactorial(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i = 2; i <= n ; i++) {
            fact = fact.multiply(new BigInteger(""+i));
        }
        return fact;
    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
            System.out.println(thr.getName()+" " + number + "! ="+ getFactorial(number));
    }

    @Override
    public String toString() {
        return "NewThread{" + "number=" + number + '}';
    }
}
