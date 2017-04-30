package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

    public static void main(String[] args) {
      HashMap<String, Date> map = createMap();
      removeAllSummerPeople(map);
        for (Map.Entry<String, Date> par : map.entrySet())
        {
            String s1 = par.getKey();
            Date d1 = par.getValue();
            System.out.println(s1 + " - " + d1);
        }
    }


    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 10 1983"));
        map.put("Брусли", new Date("AUGUST 15 1981"));
        map.put("Ющенко", new Date("SEPTEMBER 5 1990"));
        map.put("Макартни", new Date("NOVEMBER 1 1981"));
        map.put("Кортни", new Date("JULY 9 1980"));
        map.put("Лилия", new Date("JUNE 19 1980"));
        map.put("Бусинка", new Date("MAY 21 1980"));
        map.put("Некрасов", new Date("JUNE 27 1988"));
        map.put("Рональд", new Date("JULY 1 1981"));
        map.put("Дмитренко", new Date("JUNE 1 1987"));

        return map;
        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        HashMap<String, Date> copyMap = new HashMap<String, Date>(map);

        for (Map.Entry<String, Date> element : copyMap.entrySet())
        {
            if ((element.getValue().getMonth() > 4) & (element.getValue().getMonth() < 8)) {
                map.remove(element.getKey());
            }
        }
    }
}
