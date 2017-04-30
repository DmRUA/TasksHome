package com.HomeWork9.task4;

/**
 * Created by DmRG on 15.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Шелдон");
        Human human2 = new Human("Леонард");
        Human human3 = new Human("Воловиц");
        Human human4 = new Human("Кутрапалли");
        Human human5 = new Human("Пенни");

        TurnByDoubleCola turn = new TurnByDoubleCola(10);

        turn.addturnHuman(human1);
        turn.addturnHuman(human2);
        turn.addturnHuman(human3);
        turn.addturnHuman(human4);
        turn.addturnHuman(human5);

        turn.getCola();

        System.out.println(turn);
    }
}
