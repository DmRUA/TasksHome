package com.HomeWork9.task4;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Created by DmRG on 15.02.2017.
 */
public class TurnByDoubleCola {
    private ArrayDeque<Human> arrayDeque = new ArrayDeque<>();
    private int countCola;

    public TurnByDoubleCola(int countCola) {
        this.countCola = countCola;
    }

    public void addturnHuman(Human human){
        arrayDeque.add(human);
    }

    public void getCola(){
        for (int i = 0; i < countCola; i++) {
           Human human = arrayDeque.pollFirst();
           arrayDeque.addLast(human);
           arrayDeque.addLast(human);
        }
    }

    public StringBuilder turnPrint(){
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Human human : arrayDeque) {
            sb.append( i + " человек в очереди: " + human.getSurName() + ", ");
            i++;
        }
        return sb;
    }

    @Override
    public String toString() {
        return "TurnByDoubleCola{" + "Очередь= " + turnPrint() + " , Количество выданой колы=" + countCola + '}';
    }
}
