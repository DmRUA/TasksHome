package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String str1 = buf.readLine();
        int num = Integer.parseInt(str1);
        if ( num > 0) { num = num * 2;
            System.out.println(num);
        }
          else { num = num + 1;
            System.out.println(num);}
    }

}