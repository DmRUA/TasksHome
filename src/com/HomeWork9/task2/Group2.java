package com.HomeWork9.task2;


import java.io.*;
import java.util.ArrayList;

/**
 * Created by DmRG on 14.02.2017.
 */
public class Group2 implements Commisar2, Serializable {
    private String nameGroup;
    private static final long serialVersionUID = 1L;
    private ArrayList<Student2> arrayStudent = new ArrayList<>();
    private int countStudent = 0;
    private String pathToFile;

    public Group2(ArrayList<Student2> arrayStudent) {
        this.arrayStudent = arrayStudent;
    }

    public Group2() {
    }



    public Group2(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public ArrayList<Student2> getArrayStudent() {
        return arrayStudent;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }


    public void setArrayStudent(ArrayList<Student2> arrayStudent) {
        this.arrayStudent = arrayStudent;
    }

    public int getCountStudent() {
        return countStudent;
    }

    public void setCountStudent(int countStudent) {
        this.countStudent = countStudent;
    }

    public void addStudent(Student2 student) throws MyException2 {
        if (countStudent >= 10) throw new MyException2();
        arrayStudent.add(student);
        countStudent++;
    }

    public void removeStudent(Student2 student){
        boolean temp = false;
        countStudent = countStudent - 1;
        for (int i = 0; i < arrayStudent.size(); i++) {
            if (arrayStudent.get(i).equals(student)) {
                arrayStudent.remove(i);
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
        for (int i = 0; i < arrayStudent.size(); i++) {
            if ((arrayStudent.get(i).getSurname().toLowerCase().equals(surname.toLowerCase()))) {
                System.out.println("Вот данные по фамилии студента " + surname + " :"); infoStudentprint(arrayStudent.get(i));
                f = true;
                break;
            }
            nameGrouptemp = arrayStudent.get(i).getNameGroup();
        }
        if (f == false) System.out.println("Cтудента с фамилией " + surname + " в группе " + nameGrouptemp + " нету");

    }

    public void infoStudentprint(Student2 student){
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
        for (int i = 0; i < arrayStudent.size() ; i++) {
            for (int j = 1; j < arrayStudent.size() - i; j++) {
                if ((arrayStudent.get(j-1).getAge() > arrayStudent.get(j).getAge()));
                    Student2 temp =  arrayStudent.get(j);
                    arrayStudent.set(j, arrayStudent.get(j-1));
                    arrayStudent.set(j-1, temp);
                }
            }
        }

    public void sortStudentSurname(){
        for (int i = 0; i < arrayStudent.size(); i++) {
            Student2 temp = arrayStudent.get(i);
            int j = i - 1;
            while ((j >= 0) && (isGreaterThan( arrayStudent.get(j).getSurname(), temp.getSurname()))){
                 arrayStudent.set(j+1, arrayStudent.get(j));
                j--;
            }
            arrayStudent.set(j+1, temp);
        }
    }


    public boolean isAddNewStudentInGroup() throws IOException {
        if (countStudent >= 10) {
            System.out.println("В данной группе уже нету места для новых студентов, для добавления нужно кого то удалить!");
            return false;
        } else {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    Student2 tempStudent = new Student2();
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
                    arrayStudent.add(tempStudent);
                    countStudent++;
                }
            return true;
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
            for (int i = 0; i < arrayStudent.size(); i++) {
                    f3.println( (i+1) + " Студент в группе: " +
                            "Имя: " + "," + arrayStudent.get(i).getName() + "," +
                            "Фамилия: " + "," + arrayStudent.get(i).getSurname() + "," +
                            "Возраст: " + "," + arrayStudent.get(i).getAge() + "," +
                            "Рост: " + "," + arrayStudent.get(i).getHeight() + "," +
                            "Вес: " + "," + arrayStudent.get(i).getWeight() + "," +
                            "Пол: " + "," + arrayStudent.get(i).isSex() + "," +
                            "Образование: " + "," + arrayStudent.get(i).isEducation() + "," +
                            "Название университета: " + "," + arrayStudent.get(i).getNameUniversity() + "," +
                            "Название группы: " + "," + arrayStudent.get(i).getNameGroup() + "," +
                            "Курс: " + "," + arrayStudent.get(i).getNumberCourse() + ",");
                }
            }
         catch (IOException e) {
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

    public Group2 readFileGroupSerialization(String pathToFile){
        try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(pathToFile))){
            return  (Group2)OIS.readObject();
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
                Student2 tempStudent = new Student2(tempList.get(1),
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
        } catch (MyException2 e) {
            e.printStackTrace();
        }
    }

    public StringBuilder arrstring(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayStudent.size(); i++) {
                sb.append( (i+1) + " Студент в группе: " +
                        " Имя: " + arrayStudent.get(i).getName() +
                        " Фамилия: " + arrayStudent.get(i).getSurname() +
                        " Возраст: " + arrayStudent.get(i).getAge() +
                        " Рост: " + arrayStudent.get(i).getHeight() +
                        " Вес: " + arrayStudent.get(i).getWeight() +
                        " Пол: " + arrayStudent.get(i).getSex() +
                        " Образование: " + arrayStudent.get(i).getEducation() +
                        " Название университета: " + arrayStudent.get(i).getNameUniversity() +
                        " Название группы: " + arrayStudent.get(i).getNameGroup() +
                        " Курс: " + arrayStudent.get(i).getNumberCourse() + "\n");
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
    public Group2 returnRecruits(Group2 group) {
        Group2 tempGroup = new Group2();
        int j = 0;
        for (int i = 0; i < group.arrayStudent.size(); i++) {
            if ((group.arrayStudent.get(i).isSex()) && (group.arrayStudent.get(i).getAge() > 18)) {
                tempGroup.arrayStudent.add(group.arrayStudent.get(i));
                j++;
            }
        }
        tempGroup.countStudent = j;
        return tempGroup;
    }
}
