package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
// здесь инициализируем маси подсчета строк что бы не было null, и инициализируем каждый елемент масива нулями
        Integer[] countALPHABET = new Integer[33];
        for (int i = 0; i < countALPHABET.length; i++) {
            countALPHABET[i] = 0;
        }
        int j = 0; // запоминаем елемент массива в котором будем считать количество букв
        Iterator<Character> iterCH = alphabet.iterator();
        while (iterCH.hasNext()){
          char tempchar = iterCH.next();
          int count = 0;
          for (String s : list) {
              char[] arrayCH = s.toCharArray();
              for (int i = 0; i < arrayCH.length; i++) {
  /*почему то с этим условием и без ввода дополнительных переменных не проходит условие проверку в дебагере смотрел
  то если я напрямую вытаскиваю елемент с масива с помощью итератора iterCH.next() то значение имеет тип "а" типа строка я
  так понимаю, хотя масив чаров, но пробовал сделать и приведение типов и все остальное но результат такой же, если же банально присвоить переменной
  значение текущего масива iterCH.next() , то все работает не понимаю почему именно так*/
                  if ( /*iterCH.next() == arrayCH[i])*/ tempchar == arrayCH[i]) {
                    count = count + 1;
                  }
              }
            }
            countALPHABET[j] = count;
            j++;
        }
        for (int i = 0; i < countALPHABET.length; i++) {
            System.out.println(alphabet.get(i) + " " + countALPHABET[i]);
        }
    }

}
