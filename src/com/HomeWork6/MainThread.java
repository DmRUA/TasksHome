package com.HomeWork6;

/**
 * Created by DmRG on 03.02.2017.
 */
public class MainThread {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            Thread tempThread = new Thread (new NewThread(i));
            tempThread.start();
        }
    }
}

