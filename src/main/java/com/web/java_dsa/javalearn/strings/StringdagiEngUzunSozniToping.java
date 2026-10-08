package com.web.java_dsa.javalearn.strings;

import java.util.Scanner;

public class StringdagiEngUzunSozniToping {
    public static void main(String[] args) {
        // Stringdagi eng uzun so‘zni toping.
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String maxWord="";
        String[] words = text.split("\\s+");
        for (String word : words){
            if (word.length() > maxWord.length()){
                maxWord = word;
            }
        }
        System.out.print(maxWord);
    }
}
