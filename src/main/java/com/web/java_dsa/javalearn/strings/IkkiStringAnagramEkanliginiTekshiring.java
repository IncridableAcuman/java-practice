package com.web.java_dsa.javalearn.strings;

import java.util.Arrays;
import java.util.Scanner;

public class IkkiStringAnagramEkanliginiTekshiring {
    public static boolean checkingToAnagram(String first,String second){
        char[] firsts = first.toCharArray();
        char[] seconds = second.toCharArray();
        Arrays.sort(firsts);
        Arrays.sort(seconds);
        return Arrays.equals(firsts, seconds);
    }
    public static void main(String[] args) {
        // Ikki string anagram ekanligini tekshiring.
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        boolean result = checkingToAnagram(first,second);
        System.out.print(result);
    }
}
