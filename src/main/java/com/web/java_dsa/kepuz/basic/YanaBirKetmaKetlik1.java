package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class YanaBirKetmaKetlik1 {
    public static void main(String[] args) {
        // Yana bir ketma-ketlik #1
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            if (i % 2 == 1){
                sum += i;
            } else {
                sum += ( i * (-1) );
            }
        }
        System.out.println(sum);
    }
}
