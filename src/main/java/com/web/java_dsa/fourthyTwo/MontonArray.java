package com.web.java_dsa.fourthyTwo;

import java.util.Scanner;

public class MontonArray {
    public static boolean isMonotonic(int[] arr){
        if (arr.length == 1 || arr.length == 0){
            return true;
        }
        boolean increase = true;
        boolean decrease = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i+1]){
                increase=false;
            }
            if (arr[i] < arr[i+1]){
                decrease=false;
            }
        }
        return increase || decrease;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        boolean isMonotonic = isMonotonic(arr);
        System.out.print(isMonotonic);
    }
}
