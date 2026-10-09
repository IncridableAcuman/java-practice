package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class DarajaniTopish2 {
    public static void main(String[] args) {
        // Darajani topish #2
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int c = scanner.nextInt();
        int j=0,p=1;
        while ( p < c && a > 1 ){
            p *= a;
            j++;
        }
        System.out.println(p==c ? j : 0);
    }
}
