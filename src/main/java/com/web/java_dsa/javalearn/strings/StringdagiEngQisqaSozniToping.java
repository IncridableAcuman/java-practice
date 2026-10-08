package com.web.java_dsa.javalearn.strings;

import java.util.Scanner;

public class StringdagiEngQisqaSozniToping {
    public static void main(String[] args) {
        // Stringdagi eng qisqa so‘zni toping.
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split("\\s+");
        String minWord = words[0];
        for (String word : words){
            if (word.length() < minWord.length()){
                minWord = word;
            }
        }
        System.out.print(minWord);
    }
}
