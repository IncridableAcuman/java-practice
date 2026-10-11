package com.web.java_dsa.javalearn.strings;

import java.util.Scanner;

public class HarBirSozningBirinchiHarfiniKattaHarfgaOzgartiring {
    public static void main(String[] args) {
        /// Har bir so‘zning birinchi harfini katta harfga o‘zgartiring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i=0;i<n;i++){
            strings[i] = scanner.next();
        }
        for (int i=0;i<strings.length;i++){
            String word = strings[i];
            if (word != null && !word.isEmpty()){
                strings[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }
        }
        for (String string : strings){
            System.out.println(string);
        }
    }
}
