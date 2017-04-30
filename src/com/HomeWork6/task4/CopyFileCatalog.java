package com.HomeWork6.task4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

/**
 * Created by DmRG on 07.02.2017.
 */
public class CopyFileCatalog implements Callable<Integer> {
    private String fileSourceAdress;
    private String fileReceiverAdress;
    private static int countCopyFile = 0;

    public CopyFileCatalog(String fileSourceAdress, String fileReceiverAdress) {
        super();
        this.fileSourceAdress = fileSourceAdress;
        this.fileReceiverAdress = fileReceiverAdress;
    }



    public static int getCountCopyFile() {
        return countCopyFile;
    }

    @Override
    public Integer call() throws Exception {
        try (FileInputStream fis = new FileInputStream(fileSourceAdress); FileOutputStream fos = new FileOutputStream(fileReceiverAdress)) {
            byte[] buffer = new byte[1024];
            int byteread = 0;
            for (; (byteread = fis.read(buffer)) > 0; ) {
                fos.write(buffer, 0, byteread);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return countCopyFile++;
    }
}
