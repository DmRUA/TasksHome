package com.HomeWork10;

import com.HomeWork9.tasks3.CharConteiner;
import javafx.beans.binding.StringBinding;

import javax.xml.bind.SchemaOutputResolver;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by DmRG on 16.02.2017.
 */
public class Translate implements Serializable {
    private static final long serialVersionUID = 1L;
    private HashMap<String, String> map = new HashMap<>();
    private String pathTofileEnglish;
    private String pathTofileUkrainian;

    public Translate() {
    }

    public Translate(String pathTofileEnglish, String pathTofileUkrainian) {
        this.pathTofileEnglish = pathTofileEnglish;
        this.pathTofileUkrainian = pathTofileUkrainian;
    }

    public String getPathTofileEnglish() {
        return pathTofileEnglish;
    }

    public void setPathTofileEnglish(String pathTofileEnglish) {
        this.pathTofileEnglish = pathTofileEnglish;
    }

    public String getPathTofileUkrainian() {
        return pathTofileUkrainian;
    }

    public void setPathTofileUkrainian(String pathTofileUkrainian) {
        this.pathTofileUkrainian = pathTofileUkrainian;
    }

    public void loaddicttofile(String path){
        System.out.println("Считали словарь");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path),"Cp1251"))){
            String str = "";
            for(; (str = reader.readLine()) != null;) {
                String[]arrString = str.split("\t", 2);
                    addwordmap(arrString[0], arrString[1]);
            }

        } catch (IOException e) {e.printStackTrace();}
    }

    public void addwordmap(String engl, String transl) {
       if (map.containsKey(engl.toLowerCase())) {
           System.out.println("Значение " + engl + " уже существует в словаре");
           System.out.println("Вы хотите заменить существующее значение? Введите \"yes\" если да");
           Scanner sc = new Scanner(System.in);
            if (sc.nextLine().toLowerCase().equals("yes")) {
                String temp="";
                temp = map.put(engl.toLowerCase(), transl);
                System.out.println("Слово: " + engl + " теперь соответствует значению: " + transl + ", ранее было значение: " + temp);
            }
          else System.out.println("Значение не изменили");
       }
       map.put(engl.toLowerCase(),transl);
    }

    public void saveDictSerial(String path){
        if (path == null) throw new IllegalArgumentException("Не правильный путь к файлу");
        File filedict = new File(path);
        if(!filedict.exists() || !filedict.isFile()){
            throw new IllegalArgumentException("Ошибка чтения файла");
        }
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filedict))){
            oos.writeObject(this);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public Translate loadDictSerial(String path){
        if (path == null) throw new IllegalArgumentException("Не правильный путь к файлу");
        File filedict = new File(path);
        if(!filedict.exists() || !filedict.isFile()){
            throw new IllegalArgumentException("Ошибка чтения файла");
        }
        Translate result = new Translate();
        try (ObjectInputStream OIS=new ObjectInputStream(new FileInputStream(filedict))){
            result = (Translate) OIS.readObject();
        } catch(IOException |
                ClassNotFoundException e){
            System.out.println("ERROR load Translate !!!");
        }
        return result;
    }

    public void translate() {
        File english = new File(pathTofileEnglish);
        if (pathTofileEnglish == null) throw new IllegalArgumentException("Не правильный путь к файлу");
        if(!english.exists() || !english.isFile()) {
            throw new IllegalArgumentException("Ошибка чтения файла");
        }
        StringBuilder sb = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(english))){
          String str = "";
          for (;(str = reader.readLine())!=null ;){
          sb.append(createEnglishTranslate(str) + "\n");
          }
        } catch (IOException e) {e.printStackTrace();}

        try(BufferedWriter f = new BufferedWriter(new FileWriter(pathTofileUkrainian))){
            f.write(String.valueOf(sb));
        } catch(IOException e){
            System.out.println(e);
        }
    }

    public StringBuilder createEnglishTranslate(String str){
        str = str + " "; // что бы отработать последний символ, добавляем один лишний пробел все равно в стринрг билдер он не попадет
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toLowerCase().toCharArray();
        String wordEnglishConteiner = "";
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                wordEnglishConteiner = wordEnglishConteiner + arr[i];
            }  else if (map.containsKey(wordEnglishConteiner)) {
                sb.append(map.get(wordEnglishConteiner) + arr[i]);
                wordEnglishConteiner = "";
            }
            else if (wordEnglishConteiner.equals("")) {
                sb.append(arr[i]);
            } else {
                System.out.println("Нету перевода для слова: " + wordEnglishConteiner + " добавьте перевод для данного слова");
                Scanner sc = new Scanner(System.in);
                String wordRussian = sc.nextLine();
                map.put(wordEnglishConteiner, wordRussian);
                sb.append(wordRussian + " ");
                wordEnglishConteiner = "";
            }
        }
        return sb;
    }
}
