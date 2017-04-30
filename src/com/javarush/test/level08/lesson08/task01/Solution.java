package com.javarush.test.level08.lesson08.task01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        Set<String> setList = new HashSet<>();
        setList.add("Лола");
        setList.add("Ля");
        setList.add("Лира");
        setList.add("Локо");
        setList.add("Лилия");
        setList.add("Лалал");
        setList.add("Леон");
        setList.add("Лакомка");
        setList.add("Лазаня");
        setList.add("Лупа");
        setList.add("Лариса");
        setList.add("Лак");
        setList.add("Лимон");
        setList.add("Лето");
        setList.add("Лунатик");
        setList.add("Лавка");
        setList.add("Лоб");
        setList.add("Лиза");
        setList.add("Лама");
        setList.add("Луна");

        return (HashSet<String>)setList;
    }

    public static void main(String[] args) {

    }
}
