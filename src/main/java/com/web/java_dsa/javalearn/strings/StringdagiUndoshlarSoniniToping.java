package com.web.java_dsa.javalearn.strings;

import java.util.Scanner;

public class StringdagiUndoshlarSoniniToping {
    public static void main(String[] args) {
        // Stringdagi undoshlar sonini toping.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String vowels = "AEUIOaeuio";
        int count = 0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && vowels.indexOf(ch) == -1){
                count++;
            }
        }
        System.out.println(count);
    }
}
