package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        double res;
        res = convertEurToUsd(50, 1.3);
        System.out.println("в доларрах будет курс " + res);
        res = convertEurToUsd(14, 2.3);
        System.out.println("в доларрах будет курс " + res);//напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course){
        double res;
        res = eur * course;
        return res;//напишите тут ваш код
    }
}
