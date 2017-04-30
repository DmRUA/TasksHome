package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String str = buf.readLine();
        int dayweak = Integer.parseInt(str);
        if ((dayweak < 7) && (dayweak > 0))
          { if (dayweak == 1) System.out.println("понедельник");
              else { if (dayweak == 2) System.out.println("вторник");
                else { if (dayweak == 3) System.out.println("среда");
                  else { if (dayweak == 4) System.out.println("четверг");
                    else { if (dayweak == 5) System.out.println("пятница");
                      else { if (dayweak == 6) System.out.println("суббота");
                        else System.out.println("воскресенье");}}}}}}
           else System.out.println("такого дня недели не существует");
    }

}