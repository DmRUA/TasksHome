package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

/*
0 получается свой собственный getStackTrace
1 имя собственного метода
2 имя метода, который вызвал
stackTraceElements[2].getMethodName(); возвращает имя метода который вызвал
начинаем с 5-го метода напрмер сначала 0-вой метод это вызов getstacktrace на верху(на нулевом "0" елементе масива
лежат метод который вызван самый последний как в стеке мы берем сначала начальный метод потом на первом елементе у нас идет метод 5 который вызываеться с
4 метода. и уже на втором месте идет сам четвертый метод, но когда мы уходим с 5-го метода то уже забираем со стека 2 метода и проходим все по новой и что
бы нам вывести правильные номера когда методы освободились нам нужно считат все заново в данном случае это всегда будет два в параметре.
*/

    public static String method1()
    {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name + " 1-й метод");
        return name;

    }

    public static String method2()
    {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name + " 2-й метод");
        return name;

    }

    public static String method3()
    {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name + " 3-й метод");
        return name;

    }

    public static String method4()
    {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name + " 4-й метод");
        return name;

    }

    public static String method5()
    {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[1].getMethodName();
        System.out.println(name + " 5-й метод");
        return name;

    }
}
