package com.web.java_dsa.kepuz.medium;

import java.util.Scanner;

public class Problem859 {
    public static int fact(int a){
        if (a == 1) return 1;
        return a * fact(a - 1);
    }
    public static void main(String[] args) {
        // https://kep.uz/problems/859
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int res = a + fact(b);
        System.out.println(res);
    }
}
