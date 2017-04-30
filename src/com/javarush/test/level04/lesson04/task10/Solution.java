package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str1 = buf.readLine();//напишите тут ваш код
        String str2 = buf.readLine();
        String str3 = buf.readLine();
        int nstr1 = Integer.parseInt(str1);
        int nstr2 = Integer.parseInt(str2);
        int nstr3 = Integer.parseInt(str3);
         if (nstr1 == nstr2)
          { if (nstr1 ==nstr3) {
              System.out.print(nstr1+" "+nstr2+" "+nstr3);
          } else
              {
                  System.out.print(nstr1+" "+nstr2);
              }
          } else {
             if (nstr1 ==nstr3) {
                 System.out.print(nstr1+" "+nstr3);
             } else { if (nstr2 == nstr3) System.out.print(nstr2+" "+nstr3);}
         }

    }
}