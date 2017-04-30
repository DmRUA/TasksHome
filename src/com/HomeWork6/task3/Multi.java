package com.HomeWork6.task3;

/**
 * Created by DmRG on 07.02.2017.
 */
public class Multi {
    static void sort(int[] array, int threadNumber) {
        Single[] threadarray = new Single[threadNumber];
        for (int i = 0; i < threadarray.length; i++) { //здесь ничего не изменял начальная точка
            int size = array.length / threadNumber;
            int begin = size * i;
            int end = ((i + 1) * size);
            if ((array.length - end) < size) {
                end = array.length;
            }
            threadarray[i] = new Single(array, begin, end);
        }
        for (int i = 0; i < threadarray.length; i++) {
            try {
                threadarray[i].getThr().join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.arraycopy(mergeArrays(array, threadarray), 0, array, 0, array.length);
    }

    private static int[] mergeArrays(int[] array, Single[] threadarray) {
        int[] arr = new int[array.length];
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int k = -1;
            for (int j = 0; j < threadarray.length; j++) {
                if (!threadarray[j].isStop() && min > threadarray[j].peekElement()) {
                    min = threadarray[j].peekElement();
                    k = j;
                }
            }
            if (k != -1) {
                arr[i] = threadarray[k].pollElement();
            }
        }
        return arr;
    }
}
