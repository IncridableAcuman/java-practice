package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class MaksimalSon {
    public static void main(String[] args) {
        // https://kep.uz/problems/1398
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int sum = a + b + c + d;
        int max = Math.max(a,Math.max(b,Math.max(c,d)));
        System.out.println((sum - max) < max ? "Yes" : "No");
    }
}
