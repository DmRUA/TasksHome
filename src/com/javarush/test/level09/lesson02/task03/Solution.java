package com.javarush.test.level09.lesson02.task03;

/* Метод должен вернуть номер строки кода, из которого вызвали этот метод
Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер строки кода, из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
*/

import java.util.Stack;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static int method1()
    {
        method2();
        StackTraceElement[] stacktraceelemment = Thread.currentThread().getStackTrace();
        System.out.println(stacktraceelemment[2].getLineNumber() + " 1 method");
        return stacktraceelemment[2].getLineNumber();
    }

    public static int method2()
    {
        method3();
        StackTraceElement[] stacktraceelemment = Thread.currentThread().getStackTrace();
        System.out.println(stacktraceelemment[2].getLineNumber() + " 2 method");
        return stacktraceelemment[2].getLineNumber();
    }

    public static int method3()
    {
        method4();
        StackTraceElement[] stacktraceelemment = Thread.currentThread().getStackTrace();
        System.out.println(stacktraceelemment[2].getLineNumber() + " 3 method");
        return stacktraceelemment[2].getLineNumber();
    }

    public static int method4()
    {
        method5();
        StackTraceElement[] stacktraceelemment = Thread.currentThread().getStackTrace();
        System.out.println(stacktraceelemment[2].getLineNumber() + " 4 method");
        return stacktraceelemment[2].getLineNumber();
    }

    public static int method5()
    {
        StackTraceElement[] stacktraceelemment = Thread.currentThread().getStackTrace();
        System.out.println(stacktraceelemment[2].getLineNumber() + " 5 method");
        return stacktraceelemment[2].getLineNumber();
    }
}
