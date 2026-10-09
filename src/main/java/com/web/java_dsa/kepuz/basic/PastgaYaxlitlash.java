package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class PastgaYaxlitlash {
    public static void main(String[] args) {
        // Pastga yaxlitlash
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println(a > 0 ? (int) a : (int) Math.floor(a));
    }
}
