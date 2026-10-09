package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class UzunSozlar {
    public static void main(String[] args) {
        // https://kep.uz/problems/28
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i=0;i<n;i++){
            strings[i] = scanner.next();
        }
        for (int i=0;i<strings.length;i++){
            String word = strings[i];
            int len = word.length();
            if (len > 10){
                String shorted = word.charAt(0) + "" + word.charAt(len - 1);
                System.out.println(shorted);
            } else {
                System.out.println(word);
            }
        }
    }
}
