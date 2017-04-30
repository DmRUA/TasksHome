package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str1 = buf.readLine();
        String str2 = buf.readLine();
        String str3 = buf.readLine();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = Integer.parseInt(str3);
        int buf1;
        if (a < b)
        { buf1 = a;
          a = b;
          b = buf1; }
         if ( b < c)
         {
             buf1 = b;
             b = c;
             c = buf1;
         }
         if (a < b)
         {
             buf1 = a;
             a = b;
             b = buf1;
         }
        System.out.print(a+" "+b+" "+c);
    }
}
