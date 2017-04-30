package com.HomeWork9.tasks3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by DmRG on 16.02.2017.
 */
public class CharConteiner {
    ArrayList<CharCount> charCounts = new ArrayList<>();

    public void readFileandCountch(String path) {
        try (BufferedReader buf = new BufferedReader(new FileReader(path))) {
            String str = "";
            for (; (str = buf.readLine()) != null; ) {
                addarr(str.toLowerCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(charCounts);
    }

    public void addarr(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                if (check(arr[i])) {
                    charCounts.add(new CharCount(arr[i]));
                }
            }
        }
    }

    public boolean check(char ch) {
        boolean result = true;
        for (int i = 0; i < charCounts.size(); i++) {
            if (charCounts.get(i).getCh() == ch) {
                charCounts.get(i).iterCount();
                result = false;
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charCounts.size(); i++) {
            sb.append("Ch: " + charCounts.get(i).getCh() + " count:" + charCounts.get(i).getCount() + " ");
        }
        return "CharConteiner{" + sb + '}';
    }
}
