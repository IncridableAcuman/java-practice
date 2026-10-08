package com.web.java_dsa.javalearn.strings;

import java.util.Scanner;

public class StringdagiSozlarSoniniHisoblang {
    public static void main(String[] args) {
        // Stringdagi so‘zlar sonini hisoblang.
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split("\\s+");
        System.out.println(words.length);
    }
}
