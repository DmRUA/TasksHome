package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args) {
        HashMap<String, String> map = createMap();

        System.out.println(getCountTheSameFirstName(map, "Андрей"));
        System.out.println(getCountTheSameLastName(map, "Дмитренко"));
    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Дмитренко", "Андрей");
        map.put("Шепель", "Ольга");
        map.put("Аршавин", "Роман");
        map.put("Маршал", "Юлиана");
        map.put("Березняков", "Александр");
        map.put("Ваган", "Ольга");
        map.put("Миронов", "Андрей");
        map.put("Зотов", "Андрей");
        map.put("Лопухов", "Андрей");
        map.put("Великий", "Антон");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count  = 0;
        for(Map.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            if (name.equals(value)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair1 : map.entrySet()) {
            String key = pair1.getKey();

            if (lastName.equals(key)) {
                count++;
            }
        }
        return count;
    }
}
