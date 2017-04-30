package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = buf.readLine();
        String s2 = buf.readLine();
        String s3 = buf.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int minus = 0, plus = 0;
         if (a > 0) {plus = plus +1;}
           else {minus = minus + 1;}
         if (b > 0) {plus = plus +1;}
           else {minus = minus + 1;}
         if (c > 0) {plus = plus +1;}
           else {minus = minus + 1;}
        System.out.println("количество отрицательных чисел: "+minus);
        System.out.println("количество положительных чисел: "+plus);

    }
}
