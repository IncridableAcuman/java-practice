package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class Kublar {
    public static void main(String[] args) {
        // https://kep.uz/problems/1554
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long j=1;
        while (true){
            long k = j * j * j;
            if (k > n){
                break;
            }
            System.out.print(k + " ");
            j++;
        }
    }
}
