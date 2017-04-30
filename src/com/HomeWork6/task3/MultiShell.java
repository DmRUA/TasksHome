package com.HomeWork6.task3;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by DmRG on 07.02.2017.
 */
public class MultiShell {

    static void sort(int[] array, int threadNumber ) {
//  Создаем масив потоков
        SingleShell[] threadarray = new SingleShell[threadNumber];

//  создаем масив с инкриментами
        int[] seq = new int[50];
        int inc;
        int s = increment(seq, array.length);;//количество элементов в массиве seq

//  Цикл по елементам массива нкремент
        while (s >= 0) {
            inc = seq[s--];
            if (inc == 1) {
//  здесь простая сортировка вставками можно сделать если нужно будет поделить может массив и нужно дождаться
//                что бы завершились остальные подсчеты
                for (int j = 0; j < threadarray.length; j++) {
                    try {
                        if (threadarray[j] != null)
                          threadarray[j].getThr().join();
//
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
                threadarray[0] = new SingleShell(array, inc, false);
            }
            else {
                for (int k = 0; k < threadarray.length; k++) {
                    if (threadarray[k] == null) {
                        threadarray[k] = new SingleShell(array, inc, false);
                        break;
                    } else {
                    if (!threadarray[k].isCheck()) { //* || threadarray[k].isCheck()*/) {
                        threadarray[k] = new SingleShell(array, inc, false);
                        break; // присваиваем первый inc и скидываем цикл что бы перейти к следующему inc
                    } else {
                        try {
                            if (k == (threadarray.length-1)) {
                                for (int i = 0; i < threadarray.length; i++) {
                                    threadarray[i].getThr().join();
                                }
                                //threadarray[k].getThr().join();
                                break;
                            }
                            else
                             continue;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                }
            }
            // здесь переход к новому inc
        }
    }
    static int increment(int inc[], int size) {
    // inc[] массив, в которые заносятся инкременты
    // size размерность этого массива
        int p1, p2, p3, s;
        p1 = p2 = p3 = 1;
        s = -1;
        do {// заполняем массив элементов по формуле Роберта Седжвика
            if (++s % 2 == 0) {
                inc[s] = 9*p1 - 9*p3 + 1;
                p2 *= 2;
                p3 *= 2;
            } else {
                inc[s] = 8*p1 - 6*p2 + 1;
            }
            p1 *= 2;
// заполняем массив, пока текущая инкремента хотя бы в 3 раза меньше количества элементов в массиве
        } while(3*inc[s] < size);

        return s > 0 ? s : 0;// возвращаем количество элементов в массиве
    }
}
