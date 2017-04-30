package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Vova", 25, "KIev 56 street 5");    //создай по два объекта каждого класса тут
        Man man2 = new Man ("Borya", 21, "Kharkov Mahinostroitelnaya 9");

        Woman woman1 = new Woman("Masha", 18, "Lviv dovbaha 1");
        Woman woman2 = new Woman("Katya", 21, "Donetsk piterskaya 7");

        System.out.println(man1.name + " "+man1.age+" "+man1.address);
        System.out.println(man2.name + " "+man2.age+" "+man2.address);
        System.out.println(woman1.name + " "+woman1.age+" "+woman1.address);
        System.out.println(woman2.name + " "+woman2.age+" "+woman2.address);

        //выведи их на экран тут
    }


    public static class Man{
      private  String name;
      private  int age;
      private  String address;

      public Man(String name, int age, String address){
          this.name = name;
          this.age = age;
          this.address = address;
      }
    }
    //добавьте тут ваши классы

    public static  class Woman
    {
       private String name;
       private int age;
       private String address;

       public Woman(String name, int age, String address){
           this.name = name;
           this.age = age;
           this.address = address;
       }

    }
}
