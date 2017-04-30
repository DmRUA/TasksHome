package com.HomeWork6.task5;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by DmRG on 07.02.2017.
 */
public class MainTask5 {
    public static void main(String[] args) {
        System.out.println("Input directory check");
        Scanner sc = new Scanner(System.in);
        String folder = sc.nextLine();
        File file = new File(folder);
        CheckFile.createArrFile(file);

        Thread thr = new Thread( new CheckFile(folder));
        thr.setDaemon(true);
        thr.start();

        System.out.println("Введите 'q' что бы завершить процесс");
        String str = sc.nextLine();

        if (str.equalsIgnoreCase("q")) {
            System.out.println("Finish");
        }

        sc.close();
        System.out.println(CheckFile.builder);
    }

}
