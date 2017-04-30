package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{

    public static void main(String[] args) {

        HashMap<String,String> map = createMap();
        removeTheFirstNameDuplicates(map);

        for (Map.Entry<String, String> pair : map.entrySet() )
              {
                  System.out.println(pair.getKey() + " - " + pair.getValue());
        }
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        HashMap<String, String> map3 = new HashMap<String, String>(map);

        //цикл по map2 мы по нему только ходим и только он используеться для получения текущих значений таких же как в других списках
        for (Map.Entry<String, String> pair : map2.entrySet())
        {
            //удаляем из map3 пару, которая соответствует pair для того что бы потом она не фигурировала но значения в данной итерации
            // у нас сохраняеться и мы потом делаем еще одну проверку есть ли такие значения еще в мапе, если есть то вызываем
            // процедуру удаления с текущим параметром для map основного
            map3.remove(pair.getKey());
            //проверяем на наличе  в map3 значений соответсвующего значению из pair
            if (map3.containsValue(pair.getValue()))
            {   //Если есть такие же значения - вызываем удаления текующего значения pair из переданной map
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
        /*
        Второй способ со счетчиком создаем вначале копию
        * HashMap<String, String> copy = new HashMap<String, String>(map);
        * делаем первый цикл со ссылкой на елемент доступа на пару
        for (Map.Entry<String,String> element :copy.entrySet())
        {
            int count = 0; ставим счетчик повторений в ноль что бы понять сколко у нас повторов
            делаем еще один цикл со вторым указателем на новую пару
            for (Map.Entry<String, String> copyElement : copy.entrySet())
            {
            ходим по этому циклу и сравниваем есть ли у нас одинаковые елементы и увеличиваем счетчик
                if (element.getValue().equals(copyElement.getValue()))
                {
                    count++;
                }
            }
            если счетчик больше нуля значит первая пара с первого цикла имеет еще копии и значит ее значение можно удалить
            вызываем процедуру для map но со значением первого цикла.
            if (count > 1)
            {
                removeItemFromMapByValue(map, element.getValue());
            }
        * */

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
