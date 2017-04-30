package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in)))
        {
           // System.out.println("Введите первое имя");
            String name1 = read.readLine();
          //  System.out.println("Введите второе имя");
            String name2 = read.readLine();
          //  System.out.println("Введите третье имя");
            String name3 = read.readLine();
            System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");

        }


    }
}