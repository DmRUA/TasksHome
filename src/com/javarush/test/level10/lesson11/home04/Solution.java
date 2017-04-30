package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

import java.util.Arrays;

public class Solution
{

    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        //напишите тут ваш код
        char[] arrayCh = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        System.out.println(s);
        for (int i = 0; i < 39; i++) {
            for (int j = 1 + i; j < s.length(); j++) {
                builder.append(arrayCh[j]);
                  }
                System.out.println(builder.toString());
                builder.delete(0, s.length());
        }
    }
}
