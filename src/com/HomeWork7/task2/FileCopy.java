package com.HomeWork7.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by DmRG on 10.02.2017.
 */
public class FileCopy implements Runnable {
    private File source;
    private File recive;
    private long size;
    private long newcopyprocent;
    private long currentprocent;
    private boolean statusCopy;
    private boolean changedStatusCopy;


    public FileCopy(File source, File recive) {
        super();
        this.source = source;
        this.recive = recive;
    }

    public boolean isStatusCopy() {
        return statusCopy;
    }

    public synchronized long getCurrentprocent() {

        while (!changedStatusCopy) {
            try {
                wait();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
        changedStatusCopy = false;

        return currentprocent;
    }

    private synchronized void setCurrentprocent(long currentprocent) {

        if (this.currentprocent != currentprocent) {
            this.currentprocent = currentprocent;
            changedStatusCopy = true;
            notify();
        }
    }

    private void CopyFile(File source, File recive) {

        if (!source.exists() || !recive.isDirectory()) try {
            throw new IOException("Файл или директория не существует");
        } catch (IOException e) {
            e.printStackTrace();
        }

        size = source.length();
        try (FileInputStream fis = new FileInputStream(source); FileOutputStream fos = new FileOutputStream(recive.getAbsolutePath() + File.separator + source.getName())) {
            byte[] buffer = new byte[1024 * 1204];
            int byteread;
            while ((byteread = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, byteread);
                newcopyprocent += byteread;
                setCurrentprocent(newcopyprocent * 100 / size);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        CopyFile(source, recive);
        statusCopy = true;
    }
}
