package com.HomeWork7.task2;

import javax.swing.*;
import java.io.File;

/**
 * Created by DmRG on 10.02.2017.
 */
public class MainTask2 {
    public static void main(String[] args) {
        String source = JOptionPane.showInputDialog("Путь к файлу\n" + "(Пример:  C:\\Ruslan\\test\\Source\\10000718.rar)");
        String rec = JOptionPane.showInputDialog("Куда копируем\n" + "(Пример:  C:\\Ruslan\\test\\Receiver)");
        File fileSource = new File(source);
        File fileRecive = new File(rec);

        FileCopy fileCopy = new FileCopy(fileSource, fileRecive);
        Thread thr1 = new Thread(new ResultCopy(fileCopy));
        Thread thr2 = new Thread(fileCopy);
        thr2.start();
        thr1.start();
    }

}
