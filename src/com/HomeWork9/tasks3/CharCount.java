package com.HomeWork9.tasks3;

import org.jetbrains.annotations.NotNull;

/**
 * Created by DmRG on 16.02.2017.
 */
public class CharCount implements Comparable<CharCount>{
    private char ch;
    private int count;

    public CharCount(char ch) {
        this.ch = ch;
        this.count = 1;
    }

    public char getCh() {
        return ch;
    }

    public int getCount() {
        return count;
    }

    public void iterCount(){
        count++;
    }


    @Override
    public int compareTo(@NotNull CharCount o) {
        return o.count - this.count;
    }
}
