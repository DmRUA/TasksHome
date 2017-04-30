package com.HomeWork9.tasks3;

/**
 * Created by DmRG on 16.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        String str = "C:\\\\Ruslan\\\\test\\\\test3.txt";
        CharConteiner charConteiner = new CharConteiner();
        charConteiner.readFileandCountch(str);
        System.out.println(charConteiner);
    }
}
