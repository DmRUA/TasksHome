package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String time = buf.readLine();
        double dtime = Double.parseDouble(time);
        int step = 0;
//        int nYellow = 0;
//        int nRed = 0;
        for (int i = 0; i < 11; i++)
        {
            if ((dtime >= 0 + step)&( dtime < 3 + step )) {
                System.out.println("зеленый");
                break;
            }
//             else nGreen = nGreen + 5;
            if ((dtime >= 3 + step)&( dtime < 4 + step )) {
                System.out.println("желтый");
                break;
            }
//            else {nYellow = nYellow + 5;}
            if ((dtime >= 4 + step)&( dtime < 5 + step )) {
                System.out.println("красный");
                break;
            }
//            else {nRed = nRed + 5;}
            step += 5;
        }
    }
}