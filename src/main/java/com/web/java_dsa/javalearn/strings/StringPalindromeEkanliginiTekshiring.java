package com.web.java_dsa.javalearn.strings;

import java.util.Scanner;

public class StringPalindromeEkanliginiTekshiring {
    public static boolean checkingToPalindrome(String str){
        str = str.toLowerCase();
        StringBuilder temp= new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            temp.append(str.charAt(i));
        }
        return str.contentEquals(temp);
    }
    public static void main(String[] args) {
        // String palindrome ekanligini tekshiring.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        boolean res = checkingToPalindrome(str);
        System.out.println(res);
    }
}
