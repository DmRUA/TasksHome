package com.HomeWork5;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * Created by DmRG on 29.01.2017.
 */
public class MyFileFilterInputOtput implements FileFilter {
    private String [] arr;

    public MyFileFilterInputOtput(String... arr) {
        super();
        this.arr = arr;
    }



    private boolean check(String ext) {
        for (String stringExt : arr) {
            if (stringExt.equals(ext)) {
                return true;
            }
        }return false;
    }

    @Override
    public boolean accept(File pathname) {
        int pointerIndex = pathname.getName().lastIndexOf(".");
        if (pointerIndex == -1) {
            return false;
        }
        String ext = pathname.getName().substring(pointerIndex + 1);
        return check(ext);
    }
}
