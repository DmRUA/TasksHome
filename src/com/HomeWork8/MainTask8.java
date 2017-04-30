package com.HomeWork8;

import java.util.Scanner;

/**
 * Created by DmRG on 14.02.2017.
 */
public class MainTask8 {
    public static void main(String[] args) {
        BlackList blacklist = new BlackList();
        Stack stack = new Stack(blacklist);
        blacklist.addBlackListClass(String.class);
        blacklist.addBlackListClass(Scanner.class);
        System.out.println(blacklist);
        System.out.println(stack);
        stack.addClass("Тест");
        stack.addClass(new Scanner(System.in));
        stack.addClass(2);
        stack.addClass(2.6);
        System.out.println(blacklist);
        System.out.println(stack);
        System.out.println("Верхний елемент в стеке");
        System.out.println(stack.peek());
        System.out.println("Удалили верхний елемент и изьяли его");
        Object obj = stack.dellelemandreturn();
        System.out.println(obj);
        System.out.println(stack);
    }
}