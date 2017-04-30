package com.HomeWork3and4;

/**
 * Created by DmRG on 26.01.2017.
 */
public class MyException extends Exception {
        @Override
        public String getMessage(){
            return "Группа переполнена в ней нету места, для нового студента";
        }
    }
