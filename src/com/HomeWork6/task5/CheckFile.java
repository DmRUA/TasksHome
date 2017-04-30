package com.HomeWork6.task5;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by DmRG on 07.02.2017.
 */
public class CheckFile implements Runnable {
    private static String[] arrayFile;
    private static String[] newArrayFile;
    private String nameDirectory;
    private Thread thr;
    public static StringBuilder builder = new StringBuilder();

    public CheckFile(String nameDirectory) {
        super();
        this.nameDirectory = nameDirectory;
        thr = new Thread(this);
    }

    @Override
    public void run() {
        for( ; ; )
        {
            checkDirectory(nameDirectory);
                try {
                    thr.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
    }

   private void checkDirectory(String checkDirectory) {
        File newFile = new File(checkDirectory);
        newArrayFile = newFile.list();
        int countOld = arrayFile.length;
        int countNew = newArrayFile.length;
        if (Arrays.equals(arrayFile, newArrayFile)) System.out.println("Ничего не изменилось!");
        else if (countOld > countNew)  {
            for (int i = 0; i < arrayFile.length; i++) {
                for (int j = 0; j < newArrayFile.length; j++) {
                    if (arrayFile[i].equalsIgnoreCase(newArrayFile[j])) break;
                      else
                          {
                              if (j == newArrayFile.length - 1)
                                {   System.out.println("Файл : " + arrayFile[i] + " был удален");
                                    builder.append("Файл : " + arrayFile[i] + " - был удален, ");
                                    continue;
                                }
                          }
                    }
                }
            }
            else
            {
            for (int i = 0; i < newArrayFile.length; i++) {
                for (int j = 0; j < arrayFile.length; j++) {
                    if (newArrayFile[i].equalsIgnoreCase(arrayFile[j])) break;
                      else
                        {
                            if ( j == arrayFile.length - 1)
                            {   System.out.println("Файл : " + newArrayFile[i] + " был добавлен");
                                builder.append("Файл : " + newArrayFile[i] + " - был добавлен, ");
                                continue;
                            }
                        }
                    }
                }
            }
        arrayFile = newArrayFile;
   }

    static void createArrFile(File file) {
        try {
            if (file.isDirectory()) {
                arrayFile = file.list();
            }
            else throw new IOException();
        } catch (IOException e) {e.printStackTrace();}
        }

    @Override
    public String toString() {
        return "CheckFile{" + "nameDirectory='" + nameDirectory + '\'' + ", thr=" + thr + '}';
    }
}
