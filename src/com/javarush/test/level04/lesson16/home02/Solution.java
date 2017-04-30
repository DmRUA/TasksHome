package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = buf.readLine();
        String s2 = buf.readLine();
        String s3 = buf.readLine();
        Integer a = Integer.parseInt(s1);
        Integer b = Integer.parseInt(s2);
        Integer c = Integer.parseInt(s3);
        if ((a>b&a<c)|(a>c&a<b)) System.out.println(a);
         if((b>a&b<c)|(b>c&b<a)) System.out.println(b);
         if((c>a&c<b)|(c>b&c<a)) System.out.println(c);
    }
}
