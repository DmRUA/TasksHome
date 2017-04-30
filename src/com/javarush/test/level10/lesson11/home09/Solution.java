package com.javarush.test.level10.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++)
        {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list)
    {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //напишите тут ваш код
//        containsKey(Object key) — проверяет, существует ли в массиве элемент с ключом key;
        for (String word: list) {
            result.put(word    , result.containsKey(word) ? result.get(word) + 1: 1);
        }
/*
   В моей реализации было сделано не правильно так как не правильно понял что именно имелось ввиду, а именно нужно было
   в любом случае добавлять слово в мап и писать что оно одно и всегда вести подсчет. Хотя по логике задание такое указано не было указанно.
   я думал что если слово повторяеться то мы выводи сколько именно раз оно встречаеться и не брать в счет именно само слово. вообщем где то так...

       Integer[] countWord = new Integer[20];
        for (int i = 0; i < countWord.length; i++) {
            countWord[i] = 0;
        }
        String wordTemp;
        for (int i = 0; i < list.size(); i++) {
          for (int j = 0; j < list.size(); j++) {
             if ((list.get(i).equals(list.get(j))) && (i != j)) {
                 countWord[i] = countWord[i] + 1;
             }
           }
        }
        for (int i = 0; i < countWord.length; i++) {
            if (countWord[i] != 0) {
                result.put(list.get(i), countWord[i]);
            }
        }*/
        return result;
    }

}
