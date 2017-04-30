package com.HomeWork10.hm10;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DmRG on 17.02.2017.
 */
public class ElementCounter <E> {
    private Map<E, Integer> map = new HashMap<E, Integer>();

    public ElementCounter(E [] array) {
        for (E elem : array) {
            map.put(elem, map.containsKey(elem) ? map.get(elem)+1 : 1);
        }
    }

    public Integer getCount(E elem) {
        return map.get(elem);
    }

    @Override
    public String toString() {
        return "ElementCounter{" + "map=" + map + '}';
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 2, 2, 4, 5, 5, 5, 6, 3, 1, 1, 6};
        ElementCounter<Integer> elementCounter = new ElementCounter<>(arr);
        System.out.println(elementCounter);
    }
}
