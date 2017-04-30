package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
       String side1 = buf.readLine();
       String side2 = buf.readLine();
       String side3 = buf.readLine();//напишите тут ваш код
       int nSide1 = Integer.parseInt(side1);
       int nSide2 = Integer.parseInt(side2);
       int nSide3 = Integer.parseInt(side3);
        if (((nSide1 + nSide2) > nSide3)&((nSide2 + nSide3) > nSide1)&((nSide3 + nSide1) > nSide2))
            System.out.println("Треугольник существует.");
            else System.out.println("Треугольник не существует.");

    }
}