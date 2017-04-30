package com.HomeWork7.task3;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by DmRG on 10.02.2017.
 */
public class MainTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла для поиска");
        String nameFile = sc.nextLine();
        System.out.println("Введите директорию, где будем искать");
        String nameDirectory = sc.nextLine();

        ArrayList<File> filesInFolder = null;
        try {
            filesInFolder = (ArrayList<File>) Files.walk(Paths.get(nameDirectory))
                    .parallel()
                    .filter(Files::isRegularFile)
                    .filter(file -> file.getFileName().toString().contains(nameFile))
                    .map(Path::toFile)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Результат поиска:");
        for (File file : filesInFolder) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
