package com.HomeWork6.task4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.FutureTask;

/**
 * Created by DmRG on 09.02.2017.
 */
public class SingleThread implements Runnable {
    public static int countThread ;
    private Thread thr;
    public ArrayList<Thread> arrthr;


    public SingleThread(FutureTask<Integer> res, int countThread) {
        super();
        this.countThread = countThread;
        thr = new Thread(res);
    }

    @Override
    public void run() {
        if  (arrthr.size() <= countThread) {
            for (int i = 0; i < arrthr.size(); i++) {
                try {
                    arrthr.get(i).join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            arrthr.removeAll(arrthr);
        }
        else {
            this.thr.start();
            arrthr.add(this.thr);
        }

    }
}
