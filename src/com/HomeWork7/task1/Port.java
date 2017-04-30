package com.HomeWork7.task1;

import java.util.concurrent.Semaphore;

/**
 * Created by DmRG on 07.02.2017.
 */
public class Port {
    private Semaphore port = new Semaphore(2,true);
    private static double ShipUnloadingSpeed = 0.5;

    public Port() {
    }

    public void shipUnloading(int boxes){
        try {
            port.acquire();
            System.out.println("корабль: " + Thread.currentThread().getName() + " зашел в порт и начали выгружать ящики");
            Thread.sleep((int) (ShipUnloadingSpeed * boxes));
            System.out.println("корабль: " + Thread.currentThread().getName() + " выгрузил ящики");
        } catch (InterruptedException e) {
            System.out.println(e);
        }port.release();
    }
}
