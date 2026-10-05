package com.web.java_dsa.kepuz.beginner;

import java.util.Scanner;

public class Problem2349 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 10_000;
        int y = 1_000_000;
        int z = n * x;
        if (n == 0){
            System.out.println(y);
        } else if (z > y){
            System.out.println(0);
        } else {
            System.out.println(y - z);
        }
    }
}
