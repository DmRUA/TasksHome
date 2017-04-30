package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String s1 = buf.readLine();
        String s2 = buf.readLine();
        int num = Integer.parseInt(s2);
        int i=1;
        while (i<=num ) {
            System.out.println(s1);
            i++;
        }

    }
}
