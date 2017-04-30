package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String str4 = buf.readLine();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = Integer.parseInt(str3);
        int d = Integer.parseInt(str4);
        if (a>b && a>c && a>d) {
            System.out.println(a);
        }else if (b>a && b>c && b>d){
            System.out.print(b);
        }else if (c>a && c>b && c>d){
            System.out.print(c);
        }else {
            System.out.print(d);
        }

        /*int max=num1;
        if (num1 > num2)
        {
            max = num1;
            num2 = num1;
        }
        if (num2 > num3)
        {
            max = num2;
            num3 = num1;
        }
        if (num3 > num4)
        {
            max=num3;
            num4 = num3;
        }
        if (num4 > num1)
        {
            max=num4;
        }
        System.out.println(max);
    }*/}
}
