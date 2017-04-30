package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg masya = new Zerg();
        masya.name = "Masya";
        Zerg buka = new Zerg();
        buka.name = "buka";
        Zerg bublik = new Zerg();
        bublik.name = "bublik";
        Zerg indi = new Zerg();
        indi.name = "indi";
        Zerg burger = new Zerg();
        burger.name = "burger";
        Zerg viksi = new Zerg();
        viksi.name = "viksi";
        Zerg ali = new Zerg();
        ali.name = "ali";
        Zerg bodya = new Zerg();
        bodya.name = "bodya";
        Zerg bigudi = new Zerg();
        bigudi.name = "bigudi";
        Zerg gigi = new Zerg();//напишите тут ваш код
        gigi.name = "gigi";
        Protos krab = new Protos();
        krab.name = "krab";
        Protos tree = new Protos();
        tree.name = "tree";
        Protos horor = new Protos();
        horor.name = "horor";
        Protos dag = new Protos();
        dag.name = "dag";
        Protos joy = new Protos();
        joy.name = "joy";
        Terran marvin = new Terran();
        marvin.name = "marvin";
        Terran marine = new Terran();
        marine.name = "marine";
        Terran tank = new Terran();
        tank.name = "tank";
        Terran fire = new Terran();
        fire.name = "fire";
        Terran siege = new Terran();
        siege.name = "siege";
        Terran klava = new Terran();
        klava.name = "klava";
        Terran virus = new Terran();
        virus.name = "virus";
        Terran manya = new Terran();
        manya.name = "manya";
        Terran kolya = new Terran();
        kolya.name = "kolya";
        Terran joker = new Terran();
        joker.name = "joker";
        Terran svyat = new Terran();
        svyat.name = "svyat";
        Terran maks = new Terran();
        maks.name = "maks";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}