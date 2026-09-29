package com.web.java_dsa.kepuz.advanced;

import java.util.Scanner;

public class SevenMode2 {
    public static void main(String[] args) {
        // https://kep.uz/problems/754
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int k=0;
        for (int i=0;i<a.length();i++){
            k = ( k * 10 + (a.charAt(i) - '0') ) % 7;
        }
        System.out.println(k);
    }
}
