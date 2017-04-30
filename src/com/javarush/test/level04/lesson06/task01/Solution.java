package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
       String str1 = buf.readLine();
       String str2 = buf.readLine();
       int a = Integer.parseInt(str1);
       int b = Integer.parseInt(str2);
        if (a > b) System.out.println(b);
          else System.out.println(a);
    }
}