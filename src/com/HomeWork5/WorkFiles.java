package com.HomeWork5;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Created by DmRG on 29.01.2017.
 */
public class WorkFiles {
    private String directory1; // путь к файлу
    private String directory2; // путь к файлу
    private String directory3; // путь к файлу
    private static final Charset UTF = Charset.forName("UTF-8");

    private String [] arr; // фильтр разрешением файлов

    public WorkFiles() {
    }

    public WorkFiles (String directory1, String directory2, String[] arr) {
        this.directory1 = directory1;
        this.directory2 = directory2;
        this.arr = arr;
    }

    public WorkFiles(String directory1, String directory2, String directory3) {
        this.directory1 = directory1;
        this.directory2 = directory2;
        this.directory3 = directory3;
    }

    // 1-е задание
//  копирование файлов с директории Directory1 в директорию Directory2 с фильтром файлов arr
    public void CopyFileAll() throws IOException {
        MyFileFilterInputOtput filefilter = new MyFileFilterInputOtput(arr);
        File folder = new File(directory1);
        File folderDest = new File(directory2);
        File[] fileList = folder.listFiles(filefilter);
            if ( fileList.length > 0 ) {
                if (!folderDest.exists() && !folderDest.isDirectory()) {
                    folderDest.mkdir();
                }
            try {
                    for (File file : fileList) {
                        String s1 = folderDest.getAbsolutePath() + "\\" + file.getName();
                        File fileTemp = new File(s1);
                        fileTemp.createNewFile();
                        CopyFile(file, fileTemp);
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка");
                }
       }
    }

    //    процедура копирования файлов
    public void CopyFile(File source, File dest) throws IOException {
        try(FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest)){
            byte[] buffer  = new byte[1024];
            int byteread = 0;
            for (; (byteread = fis.read(buffer)) > 0;) {
                fos.write(buffer, 0, byteread);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
// 2-е задание :

    public void SearchtheSameWord(){
        ArrayList<String> arrayList1 = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        try(BufferedReader f1 = new BufferedReader(new InputStreamReader( new FileInputStream(directory1), UTF));
        BufferedReader f2 = new BufferedReader(new InputStreamReader( new FileInputStream(directory2), UTF))
        ){
            String str = "";
            for(;(str=f1.readLine())!= null;) {
                for (String retval : str.split(" ")) {
                    arrayList1.add(retval);
                }
            }
            for (;(str=f2.readLine())!= null;){
                for (String retval : str.split(" ")) {
                    arrayList2.add(retval);
                }
            }
        }catch ( IOException e){
            System.out.println("ERROR");
        }
        ArrayList<String> list;
        try(PrintWriter f3 = new PrintWriter(directory3)) {
            list = SearchWord(arrayList1, arrayList2);
            for (int i = 0; i < list.size(); i++) {
                f3.println(list.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR");
        }
        }

//        сделат отдельную процедуру поиска по масивам
    private ArrayList<String> SearchWord(ArrayList<String> arrayList1, ArrayList<String> arrayList2){
        ArrayList<String> resultArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList1.size(); i++) {
            for (int j = 0; j < arrayList2.size(); j++) {
                if (arrayList1.get(i).toLowerCase().equals(arrayList2.get(j).toLowerCase())){
                    resultArrayList.add(arrayList1.get(i));
                    break;
                }
            }
        }
        return resultArrayList;
    }

        public void printFile(String str) throws FileNotFoundException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            File f = new File(str);
            BufferedReader fin = new BufferedReader(new FileReader(f));
            String name;
            String line;
            System.out.println("Вывести содержимое файла " + f.getName() + "? y/n");
            try {
                name = br.readLine();
                if (name.equals("y"))
                    while ((line = fin.readLine()) != null) System.out.println(line);
            } catch (IOException e) {
                System.out.println("Error");
            }
        }

}