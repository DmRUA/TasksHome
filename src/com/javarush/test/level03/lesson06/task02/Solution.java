package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    { String tab = " ";
        for (int y = 1; y<=10; y++)
        { for (int i = 1;i<=10; i++)
          { System.out.print(i*y + tab);}
            System.out.println();
        /* напишите тут ваш код */
        };

    }
}