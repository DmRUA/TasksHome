package com.javarush.test.level04.lesson02.task01;

/* Реализовать метод setName
Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String name равное переданному параметру String name.
*/

public class Cat {
    private String name;

    public void setName(String name) {
        //напишите тут ваш код
        this.name = name;
    }

    public static void main(String[] args) {
        String s;
        Cat cat = new Cat();
        cat.setName("Busya");
        System.out.println(cat.name);
        Cat cat1 = new Cat();
        cat1.setName("Joker");
        System.out.println(cat1.name);
        cat.setName("123435");
        System.out.println(cat.name);
    }
}
