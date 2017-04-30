package com.HomeWork9.task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by DmRG on 14.02.2017.
 */
public class Main {public static void main(String[] args) throws MyException2, IOException {
    Student2 student1 = new Student2("Вова", "Пятов", 25, 185, 72.5, true, true, "КПИ", "group",4);
    Student2 student2 = new Student2("Катя", "Орлова", 18, 185, 72.5, false, true, "КНЕУ", "group",1);
    Student2 student3 = new Student2("Вова", "Пятов", 25, 185, 72.5, true, true, "Нархоз", "group",2);
    Student2 student4 = new Student2("Александра", "Великая", 21, 185, 72.5, false, true, "КПИ", "group",1);
    Student2 student5 = new Student2("Владимир", "Коровин", 25, 185, 72.5, true, true, "КПИ", "group",4);
    Student2 student6 = new Student2("Антон", "Романов", 25, 185, 72.5, true, true, "ГВФ", "group",2);
    Student2 student7 = new Student2("Максим", "Великий", 25, 185, 72.5, true, true, "Иняз", "group",4);
    Student2 student8 = new Student2("Андрей", "Козлов", 25, 185, 72.5, true, true, "Шевченко", "group",1);
    Student2 student9 = new Student2("Саша", "Бондарь", 25, 185, 72.5, true, true, "Масачусетский", "group",4);
    Student2 student10 = new Student2("Вова", "Понамарев", 25, 185, 72.5, true, true, "КПИ", "group",3);

    Group2 group = new Group2("group");
    try {
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        group.addStudent(student6);
        group.addStudent(student7);
        group.addStudent(student8);
        group.addStudent(student9);
        group.addStudent(student10);
    } catch (MyException2 e) {e.getMessage();}
    group.setNameGroup("group");

    Group2 group2 = new Group2("group2");
    Student2 student11 = new Student2("A", "Аршавин", 52, 185, 72.5, true, true, "КПИ", "group2",4);
    Student2 student12 = new Student2("B", "Романов", 15, 185, 72.5, true, true, "ГВФ", "group2",2);
    Student2 student13 = new Student2("C", "Великий", 13, 185, 72.5, true, true, "Иняз", "group2",4);
    Student2 student14 = new Student2("D", "Козлов", 14, 185, 72.5, true, true, "Шевченко", "group2",1);
    Student2 student15 = new Student2("Y", "Бондарь", 225, 185, 72.5, true, true, "Масачусетский", "group2",4);
    Student2 student16 = new Student2("W", "Понамарев", 1, 185, 72.5, true, true, "КПИ", "group2",3);
    group2.addStudent(student11);
    group2.addStudent(student12);
    group2.addStudent(student13);
    group2.addStudent(student14);
    group2.addStudent(student15);
    group2.addStudent(student16);
    group2.setNameGroup("group2");

    ArrayList<Group2> allGroup = new ArrayList<>();
    allGroup.add(group);
    allGroup.add(group2);

    String str = "";
    for (;!str.equals("exit");){
        System.out.println("Для выхода из программы введите exit");
        System.out.println("Получить название всех групп, и количество студентов в ней, команда: allinfogroup");
        System.out.println("Получить информацию о количестве студентов в определленой группе, команда: infogroup");
        System.out.println("Добавить нового студента в группу, команда: addStudent");
        System.out.println("Создать новую группу, команда: newgroup");
        System.out.println("Удалить группу, команда: delgroup");
        System.out.println("Вывести список студентов которые подходят к призывному возрасту, команда: recruits");
        System.out.println("Отсортировать во всех группах студентов по возрасту, команда: sortage");
        System.out.println("Отсортировать во всех группах студентов в алфавитном порядке по фамилии, команда: sortsurname");
        System.out.println("Найти студента по фамилии, команда: searchstudentsurname");
        System.out.println("Сохранить группу в файл, команда: save");
        System.out.println("Загрузить группу из файла, команда: load");
        System.out.println("Сохранить группу в файл с помощью сериализации, команда: saveserial");
        System.out.println("Загрузить группу из файла с помощью сериализации, команда: loadserial");
//            System.out.println();
        Scanner sc = new Scanner(System.in);
        switch (sc.nextLine().toLowerCase()) {
            case "allinfogroup":
                System.out.println("Количество групп: " + allGroup.size());
                for (int i = 0; i < allGroup.size(); i++) {
                    System.out.println("Группа: " + allGroup.get(i).getNameGroup() + " Количество студентов в данной группе: " + allGroup.get(i).getCountStudent());

                }
                break;
            case "infogroup":
                System.out.println("Введите название группы о которой хотите получить информацию");
                String strtemp = sc.nextLine();
                for (int i = 0; i < allGroup.size(); i++) {
                    if (strtemp.equals(allGroup.get(i).getNameGroup())) {
                        System.out.println(allGroup.get(i));
                        break;
                    }
                    else if (i == allGroup.size() - 1) System.out.println("Данной группы " + strtemp + " не существует");
                }
                break;
            case "addstudent":
                System.out.println("Введите название группы в которую хотите добавить студента");
                strtemp = sc.nextLine();
                for (int i = 0; i < allGroup.size(); i++) {
                    if (strtemp.equals(allGroup.get(i).getNameGroup())) {
                        allGroup.get(i).isAddNewStudentInGroup();
                        break;
                    }  else if (i == allGroup.size() - 1) System.out.println("Данной группы " + strtemp + " не существует");
                }
                break;
            case "newgroup":
                System.out.println("Введите новое название группы:");
                strtemp = sc.nextLine();
                allGroup.add(new Group2(strtemp));
                break;
            case "delgroup" :
                System.out.println("Введите название группы, которую хотите удалить!");
                strtemp = sc.nextLine();
                for (int i = 0; i < allGroup.size(); i++) {
                    if (strtemp.equals(allGroup.get(i).getNameGroup())) {
                        allGroup.remove(i);
                        System.out.println("Группа " + strtemp + " была удалена!");
                        break;
                    }
                    else if (i == allGroup.size() - 1) System.out.println("Данной группы " + strtemp + " не существует");
                }
            case "recruits":
                System.out.println("Введите номер группы для сортировки призовников");
                strtemp = sc.nextLine();
                boolean f = true;
                for (int i = 0; i < allGroup.size(); i++) {
                    if (strtemp.equals(allGroup.get(i).getNameGroup())) {
                        f = false;
                        Group2 recruits = null;
                        recruits = allGroup.get(i).returnRecruits(allGroup.get(i));
                        recruits.setNameGroup("recruits");
                        System.out.println("Вы хотите добавить данную группу студентов в список, введите yes - да, или вывести данную группу на екран введите print");
                        String temp = sc.nextLine();
                        if (temp.equals("yes")) {
                            allGroup.add(recruits);
                            System.out.println("Добавили группу рекрутеров в список");
                        }
                        if (temp.equals("print")) {
                            System.out.println(recruits);
                        }
                        else break;
                    }
                    else if (f) System.out.println("Данной группы " + strtemp + " не существует");
                }
                break;
            case "sortage":
                for (int i = 0; i < allGroup.size(); i++) {
                    allGroup.get(i).sortStudentAge();
                    System.out.println("Отсортировано");
                }
                break;
            case "sortsurname":
                for (int i = 0; i < allGroup.size(); i++) {
                    allGroup.get(i).sortStudentSurname();
                    System.out.println("Отсортировано");
                }
                break;
            case "searchstudentsurname":
                System.out.println("Введите фамилию студента для поиска");
                strtemp = sc.nextLine();
                for (int i = 0; i < allGroup.size(); i++) {
                    allGroup.get(i).searchStudent(strtemp);
                }
                break;
            case "save":
                System.out.println("Введите название групы которую нужно сохранить");
                strtemp = sc.nextLine();
                for (int i = 0; i < allGroup.size(); i++) {
                    if (strtemp.equals(allGroup.get(i).getNameGroup())) {
                        System.out.println("Введите название файла и путь к файлу куда нужно сохранить группу, пример C:\\\\Ruslan\\\\test\\\\group1.txt");
                        String pathToFile = sc.nextLine();
                        allGroup.get(i).setPathToFile(pathToFile);
                        allGroup.get(i).saveInFile();
                    }
                }

                break;
            case "load":
                System.out.println("Введите название группы в которую хотите считать данные , пример C:\\\\Ruslan\\\\test\\\\group1.txt");
                strtemp = sc.nextLine();
                for (int i = 0; i < allGroup.size(); i++) {
                    if (strtemp.equals(allGroup.get(i).getNameGroup())) {
                        System.out.println("Введите имя файла и путь к нему");
                        strtemp = sc.nextLine();
                        allGroup.get(i).ReadFileandAddGroup(strtemp);
                        System.out.println("Файл считан");
                    }
                }
                break;
            case "saveserial":
                System.out.println("Введите название групы для сереализации группы");
                strtemp = sc.nextLine();
                for (int i = 0; i < allGroup.size(); i++) {
                    if (strtemp.equals(allGroup.get(i).getNameGroup())) {
                        System.out.println("Введите название файла и путь к файлу куда нужно сохранить группу, пример C:\\\\Ruslan\\\\test\\\\group1");
                        String pathToFile = sc.nextLine();
                        allGroup.get(i).saveInFileSerialization(pathToFile);
                        System.out.println("Файл добавлен");
                    }
                }
                break;
            case "loadserial":
                System.out.println("Вы хотите создать новую группу или счиать данные в существующую, new - создать новую, read добавить в существующую");
                strtemp = sc.nextLine();
                if (strtemp.equals("new")){
                    System.out.println("Введите название группы");
                    strtemp = sc.nextLine();
                    Group2 temp =  new Group2(strtemp);
                    System.out.println("Введите путь к файлу, пример C:\\\\Ruslan\\\\test\\\\group1");
                    strtemp = sc.nextLine();
                    temp.readFileGroupSerialization(strtemp);
                    allGroup.add(temp);
                }
                if (strtemp.equals("read")){
                    System.out.println("Введите название группы в которую хотите считать данные");
                    strtemp = sc.nextLine();
                    for (int i = 0; i < allGroup.size(); i++) {
                        if (strtemp.equals(allGroup.get(i).getNameGroup())) {
                            System.out.println("Введите путь к файлу, пример C:\\\\Ruslan\\\\test\\\\group1");
                            strtemp = sc.nextLine();
                            allGroup.get(i).readFileGroupSerialization(strtemp);
                        }
                    }
                }
                break;
            case "exit":
                str = "exit";
                break;
        }
    }
}
}
