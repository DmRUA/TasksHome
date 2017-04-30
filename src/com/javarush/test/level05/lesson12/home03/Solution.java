package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Mouse taffyMouse = new Mouse("Taffy", 5,3);
        Cat tomCat = new Cat("Tom",15,5);
        Cat butchCat = new Cat("Butch", 11,7);
        Dog spikeDog = new Dog("Spike", 8,10);
        Dog tykeDog = new Dog("tyke",2,3);


        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog
    {
        String name;
        int power;
        int height;

        public Dog(String name, int power, int height){
            this.name = name;
            this.power = power;
            this.height = height;
        }
    }

    public static class Cat {
        String name;
        int speed;
        int age;

        public Cat(String name, int speed, int age){
            this.name = name;
            this.speed = speed;
            this.age = age;
        }
    }


    //добавьте тут ваши классы

}
