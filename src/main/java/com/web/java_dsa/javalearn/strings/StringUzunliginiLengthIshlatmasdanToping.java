package com.web.java_dsa.javalearn.strings;

import java.util.Scanner;

public class StringUzunliginiLengthIshlatmasdanToping {
    public static void main(String[] args) {
        // String uzunligini length() ishlatmasdan toping.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int count = 0;
        for (int i=0;i<str.length();i++){
            count++;
        }
        System.out.println(count);
    }
}
