package com.HomeWork3and4;

import com.javarush.test.level08.lesson11.home06.Solution;

import java.io.Serializable;

/**
 * Created by DmRG on 25.01.2017.
 */
public class Human implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private String surname;
    private int age;
    private double height;
    private double weight;
    private boolean sex;
    private boolean education;

    public Human() {
    }

    public Human(String name, String surname, int age, double height, double weight, boolean sex, boolean education) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public boolean isEducation() {
        return education;
    }

    public void setEducation(boolean education) {
        this.education = education;
    }


    public void printInfo() {
        System.out.println(Human.this);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + this.name + '\'' +
                ", surname='" + this.surname + '\'' +
                ", age=" + this.age +
                ", height=" + this.height +
                ", weight=" + this.weight +
                ", sex=" + (this.sex ? "Мужской пол" : "Женский пол") +
                ", education=" + (this.education ? "Высшее образование" : "Среднее") +
                '}';
    }

}
