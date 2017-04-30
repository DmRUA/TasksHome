package com.HomeWork7.task2;

/**
 * Created by DmRG on 10.02.2017.
 */
public class ResultCopy implements Runnable {

    private FileCopy fileCopy;

    public ResultCopy() {
        super();
    }

    public ResultCopy(FileCopy fileCopyc) {
        super();
        this.fileCopy = fileCopyc;
    }

    @Override
    public void run() {
        while (!fileCopy.isStatusCopy()) {
            System.out.println("Скопировано " + fileCopy.getCurrentprocent() + "%");
        }
        System.out.println("Копирование завершено!");
    }
}
