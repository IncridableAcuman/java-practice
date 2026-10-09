package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class IkkiniDarajasi {
    public static void main(String[] args) {
        // https://kep.uz/problems/433
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n > 0 && (n & (n - 1)) == 0) ? "Yes" : "No");
    }
}
