package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str1 = buf.readLine();
        int lenstr1 = str1.length();
        String str2 = buf.readLine();
        int lenstr2 = str2.length();
         if ( str1.equals(str2)) System.out.println("Имена идентичны");
           else if (lenstr1 == lenstr2) System.out.println("Длины имен равны");
    }
}
