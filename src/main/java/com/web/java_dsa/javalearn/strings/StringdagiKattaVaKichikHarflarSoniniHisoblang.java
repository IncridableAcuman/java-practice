package com.web.java_dsa.javalearn.strings;

import java.util.Scanner;

public class StringdagiKattaVaKichikHarflarSoniniHisoblang {
    public static void main(String[] args) {
        // Stringdagi katta va kichik harflar sonini hisoblang.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int lowerCount = 0, upperCount = 0;
        for (int i=0;i<str.length();i++){
            if (Character.isLowerCase(str.charAt(i))){
                lowerCount++;
            } else {
                upperCount++;
            }
        }
        System.out.println("Lower: " + lowerCount + "\nUpper: " + upperCount);
    }
}
