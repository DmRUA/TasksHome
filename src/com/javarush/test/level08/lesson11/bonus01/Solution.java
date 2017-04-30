package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        Map<String, Integer> mapList = new HashMap<String, Integer>();
        mapList.put("January", 1);
        mapList.put("February", 2);
        mapList.put("March", 3);
        mapList.put("April", 4);
        mapList.put("May", 5);
        mapList.put("June", 6);
        mapList.put("July", 7);
        mapList.put("August", 8);
        mapList.put("September", 9);
        mapList.put("October", 10);
        mapList.put("November", 11);
        mapList.put("December", 12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        for (Map.Entry<String, Integer> elem : mapList.entrySet())
        {
            if (elem.getKey().equals(month) )  {
                System.out.println(elem.getKey() + " is " + elem.getValue() + " month");
            }
        }
    }

}
