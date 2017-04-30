package com.HomeWork10;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by DmRG on 16.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Translate translate = new Translate("C:\\Ruslan\\test\\english\\English.in","C:\\Ruslan\\test\\english\\Ukrainian.out");

        translate.loaddicttofile("C:\\Ruslan\\test\\english\\WordDict.txt");
        translate.translate();
    }
}
