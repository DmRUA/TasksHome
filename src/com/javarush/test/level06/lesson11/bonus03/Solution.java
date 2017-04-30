package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] arrMas;
        arrMas = new int[5];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <5 ; i++) {
            String s1 = reader.readLine();
            arrMas[i] = Integer.parseInt(s1);
        }

        for (int i = 0; i < arrMas.length; i++)
        {
            int temp = arrMas[i];
            int j =i-1;
            while(j >= 0 && arrMas[j] > temp) {
                arrMas[j + 1] = arrMas[j];
                j--;
            }
            arrMas[j + 1] = temp;
        }
        for (int i = 0; i < arrMas.length; i++) {
            System.out.println(arrMas[i]);
        }
    }
        //напишите тут ваш код
}