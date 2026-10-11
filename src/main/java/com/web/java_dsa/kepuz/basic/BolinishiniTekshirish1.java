package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class BolinishiniTekshirish1 {
    public static void main(String[] args) {
        // Bo'linishini tekshirish #1
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i=1;i<=n;i++){
            arr[i] = scanner.nextInt();
        }
        int x=-1,y=-1;
        boolean found=false;
        for (int i=1;i<=n;i++){
            for (int j=i+1;j<=n;j++){
                if (arr[i] % arr[j] ==0 || arr[j] % arr[i] == 0){
                    x=arr[i];
                    y=arr[j];
                    found=true;
                    break;
                }
            }
            if (found){
                break;
            }
        }
        System.out.println((x == -1 || y == -1) ? -1 : x + " " + y);
    }
}
