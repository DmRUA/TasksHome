package com.HomeWork8;

import java.util.ArrayDeque;

/**
 * Created by DmRG on 14.02.2017.
 */
public class Stack {
    private ArrayDeque<Object> stack = new ArrayDeque<>();
    private BlackList blacklist;

    public Stack(BlackList blacklist) {
        this.blacklist = blacklist;
    }

    public void addClass(Object obj) {
        if (blacklist.checkObj(obj))
              stack.addFirst(obj);
        else System.out.println("Данный класс " + obj.getClass() +  " в черном списке");
    }

    public Object dellelemandreturn(){
        return stack.pollFirst();
    }

    public Object peek(){
        return stack.peekFirst();
    }

    @Override
    public String toString() {
        return "Stack{" + "stack=" + stack + ", blacklist=" + blacklist + '}';
    }
}
