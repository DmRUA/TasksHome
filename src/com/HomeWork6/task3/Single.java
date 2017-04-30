package com.HomeWork6.task3;

/**
 * Created by DmRG on 04.02.2017.
 */
public class Single implements Runnable {
    private int[] array;
    private int begin;
    private int end;
    private Thread thr;
    private int index;
    private boolean stop = false;

    public Single(int[] array, int begin, int end) {
        super();
        this.array = array;
        this.begin = begin;
        this.end = end;
        thr = new Thread(this);
        thr.start();
        this.index = begin;
    }

    public Thread getThr() {
        return thr;
    }
    public int peekElement() {
        return array[index];
    }
    public int pollElement() {
        int temp = array[index];
        check();
        return temp;
    }
    public boolean isStop() {
        return stop;
    }

    @Override
    public void run() {
        int increment = array.length / 2;
        while (increment > 0) {
            for (int i = increment; i < array.length; i++) {
                int j = i;
                int temp = array[i];
                while (j >= increment && array[j - increment] > temp) {
                    array[j] = array[j - increment];
                    j = j - increment;
                }
                array[j] = temp;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
    }

    private void check() {
        this.index++;
        if (this.index >= this.end) {
            this.stop = true;
        }
    }
}
