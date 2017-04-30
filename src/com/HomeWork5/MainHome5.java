package com.HomeWork5;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * Created by DmRG on 29.01.2017.
 */
public class MainHome5 {

    public static void main(String args[]) throws IOException {

//          Первый пункт задания
        WorkFiles wf = new WorkFiles("myDirectory", "C:\\Ruslan\\newdirectory", new String[]{"docx", "pdf"});
        wf.CopyFileAll();

//         2-й пункт задания
        WorkFiles wf2 = new WorkFiles("C:\\Ruslan\\test\\test1.txt", "C:\\Ruslan\\test\\test2.txt", "C:\\Ruslan\\test\\test3.txt");
        wf2.SearchtheSameWord();
        wf2.printFile("C:\\Ruslan\\test\\test3.txt");



    }
}