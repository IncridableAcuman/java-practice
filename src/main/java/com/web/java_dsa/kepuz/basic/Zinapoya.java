package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class Zinapoya {
    public static void main(String[] args) {
        // https://kep.uz/problems/438
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
