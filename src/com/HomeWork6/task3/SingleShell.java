package com.HomeWork6.task3;

/**
 * Created by DmRG on 07.02.2017.
 */
public class SingleShell implements Runnable {
    private int[] array;
    private Thread thr;
    private int inc;
    private boolean check = false; //флаг на установку true - свободен

    public SingleShell(int[] array, int inc, boolean check) {
        super();
        this.array = array;
        thr = new Thread(this);
        thr.start();
        this.inc = inc;
        this.check = true;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public Thread getThr() {
        return thr;
    }

    @Override
    public void run() {
        int i,j;
        for (i = inc; i < array.length; i++) {
            int temp = array[i];
// сдвигаем элементы до тех пор, пока не дойдем до конца или не упорядочим в нужном порядке
            for (j = i - inc; (j >= 0) && (array[j] > temp); j -= inc)
                array[j + inc] = array[j];
// после всех сдвигов ставим на место j+inc элемент, который находился на i месте
            array[j + inc] = temp;
        }
        check = false;
    }
     /*   int location;
        int newelement;

        for(int i = start + inc; i < size; i += inc){
            newelement = array[i];
            location = i - inc;

            while(location >= start && array[location] > newelement){
                array[location + inc] = array[location];
                location -= inc;
            }

            array[location + inc] = newelement;

        }
    }*/
}
