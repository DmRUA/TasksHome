package com.HomeWork9.task2;

/**
 * Created by DmRG on 14.02.2017.
 */
public class MyException2 extends Exception {
    @Override
    public String getMessage(){
        return "Группа переполнена в ней нету места, для нового студента";
    }
}
