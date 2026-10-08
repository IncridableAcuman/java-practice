package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class EhtimoliySon1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/612
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int j=a;j<=b;j++){
            System.out.println(j+1);
            break;
        }
    }
}
