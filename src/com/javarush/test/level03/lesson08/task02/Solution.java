package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код
       String name = buf.readLine();
       String sNum1 = buf.readLine();
       String sNum2 = buf.readLine();
       System.out.println(name + " получает " + sNum1 + " через " + sNum2 + " лет.");
    }
}