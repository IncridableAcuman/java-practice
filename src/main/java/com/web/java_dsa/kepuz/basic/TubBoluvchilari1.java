package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class TubBoluvchilari1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/1707
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result=1;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        for (int i=0;i<n;i++){
            result *= primes[i];
        }
        long lowerbound = (long) Math.pow(10,n-1);

        while (result < lowerbound){
            result *=2;
        }
        System.out.println(result);
    }
}
