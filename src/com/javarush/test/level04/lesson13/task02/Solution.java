package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = buf.readLine();
        String s2 = buf.readLine();
        int m = Integer.parseInt(s1);
        int n = Integer.parseInt(s2);
        String s3 = "8";
        for (int y=1; y<n; y++) {s3 = s3 +"8"; }
        for (int i=1; i<=m; i++) { System.out.println(s3); }

    }
}
