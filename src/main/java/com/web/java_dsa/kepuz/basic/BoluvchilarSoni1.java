package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class BoluvchilarSoni1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/1329
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k=0;
        for (int i=1;i<=n;i++){
           for (int j=1;j<=i;j++){
               if (i%j==0){
                   k++;
               }
           }
        }
        System.out.println(k);
    }
}
