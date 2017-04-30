package com.HomeWork7.task1;

/**
 * Created by DmRG on 07.02.2017.
 */
public class Ship implements Runnable {
    private int countOfBoxes;
    private Port port;

    public Ship(int countOfBoxes, Port port) {
        super();
        this.countOfBoxes = countOfBoxes;
        this.port = port;
    }



    @Override
    public void run() {
        port.shipUnloading(countOfBoxes);
    }
}
