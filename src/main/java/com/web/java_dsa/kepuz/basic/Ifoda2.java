package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class Ifoda2 {
    public static void main(String[] args) {
        // https://kep.uz/problems/1778
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum=0;
        for (int x=1;x<=n;x++){
            sum += (a * x + b);
        }
        System.out.println(sum);
    }
}
