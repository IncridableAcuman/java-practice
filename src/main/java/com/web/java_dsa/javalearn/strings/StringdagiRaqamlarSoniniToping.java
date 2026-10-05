package com.web.java_dsa.javalearn.strings;

import java.util.Scanner;

public class StringdagiRaqamlarSoniniToping {
    public static void main(String[] args) {
        // Stringdagi raqamlar sonini toping.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        for (int i=0;i<str.length();i++){
            if (Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
