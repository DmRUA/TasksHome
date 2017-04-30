package com.HomeWork8;

import java.util.ArrayList;

/**
 * Created by DmRG on 14.02.2017.
 */
public class BlackList {
    private ArrayList<Class> blacklist = new ArrayList<>();



    public void addBlackListClass(Class aClass){
        if (chackClass(aClass))
          blacklist.add(aClass);
    }

    public boolean chackClass(Class aClass) {
        boolean f = true;
        for (int i = 0; i < blacklist.size(); i++) {
           if (blacklist.equals(aClass)) f = false;
        }
        return f;
    }

    public boolean checkObj(Object obj) {
        boolean f = true;
        for (int i = 0; i < blacklist.size(); i++) {
           if (blacklist.get(i).equals(obj.getClass())) {f = false;}
        }
        return f;
    }

    @Override
    public String toString() {
        return "BlackList{" + "blacklist=" + blacklist + '}';
    }
}
