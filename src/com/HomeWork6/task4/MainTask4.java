package com.HomeWork6.task4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Created by DmRG on 07.02.2017.
 */
public class MainTask4 {
    public static void main(String[] args) {
        String s1 = "C:\\Ruslan\\CopyFile";
        String s2 = "C:\\Ruslan\\CopyFile\\new";
        int count = CopyFileCatalog(s1, s2);
        System.out.println("Количество скопированных файлов: " + count);
    }

    public static int CopyFileCatalog(String fileSourceAdress, String fileReceiverAdress) {
        File folder = new File(fileSourceAdress);
        File folderDest = new File(fileReceiverAdress);

        File[] fileSorceArray = folder.listFiles();

        if (!folderDest.exists() && !folderDest.isDirectory()) {
            folderDest.mkdir();
        }
        ArrayList<Future<Integer>> result = new ArrayList<>();
        try {
            for (File fileElement : fileSorceArray) {
                String s1 = folderDest.getAbsolutePath() + "\\" + fileElement.getName();
                File fileTemp = new File(s1);
                fileTemp.createNewFile();
                FutureTask<Integer> res = new FutureTask<>(new CopyFileCatalog(fileElement.getAbsolutePath(), fileTemp.getAbsolutePath()));
                result.add(res);
                SingleThread thread = new SingleThread(res, 3);
//                thread.start();
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        return fileSorceArray.length;
    }
}
