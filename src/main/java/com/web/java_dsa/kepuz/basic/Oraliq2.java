package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class Oraliq2 {
    public static void main(String[] args) {
        // Oraliq #2
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a == b) ? 1 : (a > b) ? 0 : (b - a)+1);
    }
}
