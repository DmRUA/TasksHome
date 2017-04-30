package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        try (BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)))
        {
           String num = buf.readLine();
           Integer sNum = Integer.parseInt(num);
           String name = buf.readLine();
           System.out.println(name + " захватит мир через " + sNum + " лет. Му-ха-ха!");
        }

    }
}