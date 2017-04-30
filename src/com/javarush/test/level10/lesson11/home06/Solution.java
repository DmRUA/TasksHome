package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private int age;
        private boolean sex;
        private int height;
        private int weight;
        private String [] education = new String[3];
        private String adress;

        public Human() {
        }

        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(int age, boolean sex, int height) {
            this.age = age;
            this.sex = sex;
            this.height = height;
        }

        public Human(int age, boolean sex, int height, int weight) {
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(int age, boolean sex, int height, int weight, String[] education) {
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
            this.education = education;
        }

        public Human(int age, boolean sex, int height, int weight, String[] education, String adress) {
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
            this.education = education;
            this.adress = adress;
        }

        public Human(int age, boolean sex, String[] education, String adress) {
            this.age = age;
            this.sex = sex;
            this.education = education;
            this.adress = adress;
        }

        public Human(int age, boolean sex, String adress) {
            this.age = age;
            this.sex = sex;
            this.adress = adress;
        }

        public Human(int age, boolean sex, String[] education) {
            this.age = age;
            this.sex = sex;
            this.education = education;
        }

        public Human(int age, boolean sex, int weight, String[] education, String adress) {
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.education = education;
            this.adress = adress;
        }


    }
}
