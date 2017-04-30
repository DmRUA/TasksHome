package com.HomeWork3and4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by DmRG on 25.01.2017.
 */
public class Group implements Serializable, Commisar {
    private String nameGroup;
    private static final long serialVersionUID = 1L;
    private Student [] arrayStudent = new Student[10];
    private int countStudent = 0;
    private String pathToFile;

    public Group(Student[] arrayStudent) {
        this.arrayStudent = arrayStudent;
    }

    public Group() {
    }



    public Group(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public Student[] getArrayStudent() {
        return arrayStudent;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }


    public void setArrayStudent(Student[] arrayStudent) {
        this.arrayStudent = arrayStudent;
    }

    public int getCountStudent() {
        return countStudent;
    }

    public void setCountStudent(int countStudent) {
        this.countStudent = countStudent;
    }

    public void addStudent(Student student) throws MyException {
        if (countStudent >= 10) throw new MyException();
        for (int i = 0; i < arrayStudent.length; i++) {
           if (arrayStudent[i] == null) {
            arrayStudent[i] = student;
            countStudent = countStudent + 1;
            break;
           }
        }
    }

    public void removeStudent(Student student){
        boolean temp = false;
        countStudent = countStudent - 1;
        for (int i = 0; i < arrayStudent.length; i++) {
            if ((arrayStudent[i] != null) && (arrayStudent[i].equals(student))) {
                arrayStudent[i] = null;
                temp = true;
                break;
            }
        }
        if (temp == false) {
            countStudent = countStudent + 1;
            System.out.println("Данного студента нету в группе"); }

    }
    public void searchStudent(String surname){
        boolean f = false;
        String nameGrouptemp = "";
        for (int i = 0; i < arrayStudent.length; i++) {
            if ((arrayStudent[i] != null) && (arrayStudent[i].getSurname().toLowerCase().equals(surname.toLowerCase()))) {
                System.out.println("Вот данные по фамилии студента " + surname + " :"); infoStudentprint(arrayStudent[i]); //arrayStudent[i].printInfo();
                f = true;
                break;
            }
            nameGrouptemp = arrayStudent[i].getNameGroup();
        }
        if (f == false) System.out.println("Cтудента с фамилией " + surname + " в группе " + nameGrouptemp + " нету");

    }

    public void infoStudentprint(Student student){
        StringBuilder sb = new StringBuilder();
                sb.append(" Группа " + student.getNameGroup() + "\n" +
                        " Имя: " + student.getName() + "\n" +
                        " Фамилия: " + student.getSurname() + "\n" +
                        " Возраст: " + student.getAge() + "\n" +
                        " Рост: " + student.getHeight() + "\n" +
                        " Вес: " + student.getWeight() + "\n" +
                        " Пол: " + student.getSex() + "\n" +
                        " Образование: " + student.getEducation() + "\n" +
                        " Название университета: " + student.getNameUniversity() + "\n" +
                        " Курс: " + student.getNumberCourse() + "\n");
        System.out.println(sb);
    }

    public void sortStudentAge(){
        Student [] newArrayStudent = copyArrayStudent();
        for (int i = 0; i < newArrayStudent.length; i++) {
            for (int j = 1; j < newArrayStudent.length - i; j++) {
                if ((newArrayStudent[j - 1].getAge() > newArrayStudent[j].getAge())) {
                    Student temp = newArrayStudent[j];
                    newArrayStudent[j] = newArrayStudent[j - 1];
                    newArrayStudent[j - 1] = temp;
                }
            }
        }
        copyNewArrayInOld(newArrayStudent);
    }

    public void sortStudentSurname(){
        Student [] newArrayStudent = copyArrayStudent();
        for (int i = 0; i < newArrayStudent.length; i++) {
                Student temp = newArrayStudent[i];
                int j = i - 1;
                while ((j >= 0) && (isGreaterThan(newArrayStudent[j].getSurname(), temp.getSurname()))) {
                    newArrayStudent[j + 1] = newArrayStudent[j];
                    j--;
                   }
                 newArrayStudent[j + 1] = temp;
                }
        copyNewArrayInOld(newArrayStudent);
    }

//    процедура возврато сколько не пустых елементов в масиве, размер для нового массива

    private int countElementNotNullArray(){
        int count = 0;
        for (int i = 0; i < arrayStudent.length; i++) {
            if (arrayStudent[i] != null) {count = count + 1;}
        }
        return count;
    }

//    процедура копирования массива создание нового масива без пустых строк
     private Student [] copyArrayStudent(){
        int count = this.countElementNotNullArray();
        int j = 0;
        Student[] newStudentArray = new Student[count];
         for (int i = 0; i < arrayStudent.length; i++) {
             if (arrayStudent[i] != null) {
                 newStudentArray[j] = arrayStudent[i];
                 j++;
             }
         }
         return newStudentArray;
     }

//    копирование елементов отсортированного масива в основной массив перезапись елементов
    private void copyNewArrayInOld(Student[] copyArray) {
        int j = 0;
        for (int i = 0; i < copyArray.length; i++) {
            arrayStudent[j] = copyArray[i];
            j++;
            }
        }


    public boolean isAddNewStudentInGroup() throws IOException {
        if (countStudent >= 10) {
            System.out.println("В данной группе уже нету места для новых студентов, для добавления нужно кого то удалить!");
            return false;
        } else {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < arrayStudent.length; i++) {
                if (arrayStudent[i] == null) {
                    Student tempStudent = new Student();
                    System.out.println("Введите имя!");
                    tempStudent.setName(reader.readLine());
                    System.out.println("Введите фамилию");
                    tempStudent.setSurname(reader.readLine());
                    System.out.println("Введите возраст");
                    tempStudent.setAge(Integer.parseInt(reader.readLine()));
                    System.out.println("Введите рост");
                    tempStudent.setHeight(Double.parseDouble(reader.readLine()));
                    System.out.println("Введите вес");
                    tempStudent.setWeight(Double.parseDouble(reader.readLine()));
                    System.out.println("Введите пол true - мужской false - женский");
                    tempStudent.setSex(Boolean.parseBoolean(reader.readLine()));
                    System.out.println("Введите образование true - Высшее false - Среднее");
                    tempStudent.setEducation(Boolean.parseBoolean(reader.readLine()));
                    System.out.println("Введите название университета");
                    tempStudent.setNameUniversity(reader.readLine());
                    System.out.println("Введите название группы");
                    tempStudent.setNameGroup(reader.readLine());
                    System.out.println("Введите номер курса");
                    tempStudent.setNumberCourse(Integer.parseInt(reader.readLine()));
                    arrayStudent[i] = tempStudent;
                    break;
                }
            }

        return true;
        }
    }

    public void saveInFile(){
        File group = new File(pathToFile);
         if (!group.exists()) {
             try {
                 group.createNewFile();
             } catch (IOException e) {
                 System.out.println("ERROR");
             }
         }
        try(PrintWriter f3 = new PrintWriter(group.getAbsoluteFile())) {
            for (int i = 0; i < arrayStudent.length; i++) {
                if (arrayStudent[i] != null) {
                    f3.println( (i+1) + " Студент в группе: " +
                            "Имя: " + "," + arrayStudent[i].getName() + "," +
                            "Фамилия: " + "," + arrayStudent[i].getSurname() + "," +
                            "Возраст: " + "," + arrayStudent[i].getAge() + "," +
                            "Рост: " + "," + arrayStudent[i].getHeight() + "," +
                            "Вес: " + "," + arrayStudent[i].getWeight() + "," +
                            "Пол: " + "," + arrayStudent[i].isSex() + "," +
                            "Образование: " + "," + arrayStudent[i].isEducation() + "," +
                            "Название университета: " + "," + arrayStudent[i].getNameUniversity() + "," +
                            "Название группы: " + "," + arrayStudent[i].getNameGroup() + "," +
                            "Курс: " + "," + arrayStudent[i].getNumberCourse() + ",");
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }

    public void saveInFileSerialization(String pathToFile){
        try(ObjectOutputStream OOS=new ObjectOutputStream(new FileOutputStream(pathToFile))){
            OOS.writeObject(this);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public Group readFileGroupSerialization(String pathToFile){
        try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(pathToFile))){
            return  (Group)OIS.readObject();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }



    public void ReadFileandAddGroup(String path){
        File filegroup = new File(path);
        ArrayList<String> tempList = new ArrayList<String>();
        try(BufferedReader f1 = new BufferedReader(new InputStreamReader(new FileInputStream(filegroup)))) {
            String str = "";
            int i = 0;
            for(;(str=f1.readLine())!= null;) {
                for (String retval : str.split(",")) {
                    tempList.add(retval);
                }
                    Student tempStudent = new Student(tempList.get(1),
                            tempList.get(3),
                            Integer.parseInt(tempList.get(5)),
                            Double.parseDouble(tempList.get(7)),
                            Double.parseDouble(tempList.get(9)),
                            Boolean.parseBoolean(tempList.get(11)),
                            Boolean.parseBoolean(tempList.get(13)),
                            tempList.get(15),
                            tempList.get(17),
                            Integer.parseInt(tempList.get(19)));

                    this.addStudent(tempStudent);
                    i++;
                    tempList.clear();
            }

        } catch (IOException e) {
            System.out.println("ERROR");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public StringBuilder arrstring(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayStudent.length; i++) {
            if (arrayStudent[i] != null) {
                sb.append( (i+1) + " Студент в группе: " +
                        " Имя: " + arrayStudent[i].getName() +
                        " Фамилия: " + arrayStudent[i].getSurname() +
                        " Возраст: " + arrayStudent[i].getAge() +
                        " Рост: " + arrayStudent[i].getHeight() +
                        " Вес: " + arrayStudent[i].getWeight() +
                        " Пол: " + arrayStudent[i].getSex() +
                        " Образование: " + arrayStudent[i].getEducation() +
                        " Название университета: " + arrayStudent[i].getNameUniversity() +
                        " Название группы: " + arrayStudent[i].getNameGroup() +
                        " Курс: " + arrayStudent[i].getNumberCourse() + "\n");
            }
        }
        return sb;
    }

    public static boolean isGreaterThan(String a, String b) { return a.compareTo(b) > 0; }

    @Override
    public String toString() {
        if (this != null) {
            return "Группа: " + this.getNameGroup() + "\n" +
                    arrstring().toString();
        } return "Данные поля свободны ";
    }

    @Override
    public Group returnRecruits(Group group) {
         Group tempGroup = new Group();
        int j = 0;
        for (int i = 0; i < group.arrayStudent.length; i++) {
            if ((group.arrayStudent[i] != null) && (group.arrayStudent[i].isSex()) && (group.arrayStudent[i].getAge() > 18 )) {
                tempGroup.arrayStudent[j] = group.arrayStudent[i];
               j++;
            }
        }
        tempGroup.countStudent = j;
        return tempGroup;
    }
}
