package com.web.java_dsa.javalearn.strings;

import java.util.Scanner;

public class StringdagiUnliHarflarSoniniToping {
    public static void main(String[] args) {
        // Stringdagi unli harflar sonini toping.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = {'A','E','U','I','O','a','e','u','i','o'};
        int count = 0;
       for (int i=0;i<str.length();i++){
           for (Character character : chars){
               if (str.charAt(i) == character){
                   count++;
               }
           }
       }
        System.out.println(count);
    }
}
