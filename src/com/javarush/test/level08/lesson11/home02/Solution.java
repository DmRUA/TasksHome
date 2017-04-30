package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        System.out.println("Множество котов");
        Iterator<Cat> elem1 = cats.iterator();
        while (elem1.hasNext())
        {
            System.out.println(elem1.next());
        }

        Set<Dog> dogs = createDogs();

        System.out.println("Множество собак");
        Iterator<Dog> elem2 = dogs.iterator();
        while (elem2.hasNext())
        {
            System.out.println(elem2.next());
        }

        Set<Object> pets = join(cats, dogs);

        System.out.println("Совмещенное множество");
        printPets(pets);

        removeCats(pets, cats);
        System.out.println("Удаленные коты");

        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        result.add(new Cat("Мася"));
        result.add(new Cat("Котя"));
        result.add(new Cat("Карапуз"));
        result.add(new Cat("БумБум"));

        return result;
    }

    public static Set<Dog> createDogs()
    {
        //напишите тут ваш код
        HashSet<Dog> result = new HashSet<Dog>();
        result.add(new Dog("Бен"));
        result.add(new Dog("Ара"));
        result.add(new Dog("Взрыв"));

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        //напишите тут ваш код
        Iterator<Cat> elemCat = cats.iterator();
        while (elemCat.hasNext())
        {
            pets.remove(elemCat.next());
        }
    }

    public static void printPets(Set<Object> pets)
    {
        //напишите тут ваш код
        Iterator<Object> elem = pets.iterator();
        while (elem.hasNext())
        {
            System.out.println(elem.next());
        }
    }

    //напишите тут ваш код
    public static class Cat{

        private String name;

        public Cat(String name){
            this.name = name;
        }
    }
    public static class Dog{

        private String name;

        public Dog(String name){
            this.name = name;
        }
    }
    
}
