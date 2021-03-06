package com.HomeWork3and4;

import java.io.Serializable;

/**
 * Created by DmRG on 25.01.2017.
 */
public class Student extends Human implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nameUniversity;
    private String nameGroup;
    private int numberCourse;

    public Student(String nameUniversity, String nameGroup, int numberCourse) {
        this.nameUniversity = nameUniversity;
        this.nameGroup = nameGroup;
        this.numberCourse = numberCourse;
    }

    public Student(String name, String surname, int age, double height, double weight, boolean sex, boolean education, String nameUniversity, String nameGroup, int numberCourse) {
        super(name, surname, age, height, weight, sex, education);
        this.nameUniversity = nameUniversity;
        this.nameGroup = nameGroup;
        this.numberCourse = numberCourse;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }


    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public int getNumberCourse() {
        return numberCourse;
    }

    public void setNumberCourse(int numberCourse) {
        this.numberCourse = numberCourse;
    }

    public Student() {
    }

    public String getSex(){
       return this.isSex() ? "мужской" : "женский";
    }
    public String getEducation(){
       return this.isEducation() ? "Высшее" : "Неполное высшее";
    }

    @Override
    public void printInfo() {
        if (this != null ) {System.out.println(Student.this);}
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "nameUniversity='" + this.nameUniversity + '\'' +
                ", nameGroup='" + this.nameGroup + '\'' +
                ", numberCourse=" + this.numberCourse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getNumberCourse() != student.getNumberCourse()) return false;
        if (!getNameUniversity().equals(student.getNameUniversity())) return false;
        return getNameGroup().equals(student.getNameGroup());
    }

    @Override
    public int hashCode() {
        int result = getNameUniversity().hashCode();
        result = 31 * result + getNameGroup().hashCode();
        result = 31 * result + getNumberCourse();
        return result;
    }

}
