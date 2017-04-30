package com.HomeWork9.task3;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by DmRG on 15.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] alphabet = {'a', 'b' , 'c' , 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < alphabet.length; i++) {
            map.put(alphabet[i],0);
        }
        try (BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\\\Ruslan\\\\test\\\\test3.txt")))){
            String str = "";
            for( ;(str = buf.readLine()) != null; ){
                countletters(str.toLowerCase(), map);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Получили карту со списком количества букв");
        System.out.println(map);

        System.out.println("Отсортировали в порядке убывания");
        System.out.println(sortByValueReverse(map));

    }
    public static void countletters(String str, HashMap<Character, Integer> map) {
        char[] temp = str.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if (map.containsKey(temp[i]))
                  map.put(temp[i],map.get(temp[i]) + 1);
        }
    }

    public static <K, V extends Comparable<? super V>> Map<K, V>
    sortByValueReverse( Map<K, V> map )
    {
        Map<K,V> result = new LinkedHashMap<>();
        Stream <Map.Entry<K,V>> st = map.entrySet().stream();

        st.sorted(Map.Entry.<K, V>comparingByValue().reversed())
                .forEach(e ->result.put(e.getKey(),e.getValue()));
        return result;
    }
}
