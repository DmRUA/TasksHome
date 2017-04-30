package com.HomeWork7.task1;

/**
 * Created by DmRG on 07.02.2017.
 */
public class Maintask1 {

    public static void main(String[] args) {
        Port port = new Port();

        for (int i = 0; i < 3; i++) {
            Ship ship = new Ship(10, port);
            Thread thread = new Thread(ship);
            thread.start();
        }
    }
}
