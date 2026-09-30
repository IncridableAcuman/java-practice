package com.web.java_dsa.kepuz.normal;

import java.util.Scanner;

public class ToBinaryThenToDecimal {
    public static void main(String[] args) {
        // https://kep.uz/problems/927
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String x = Integer.toBinaryString(a);
        String y = Integer.toBinaryString(b);
        String z = x + y;
        int decimal = Integer.parseInt(z,2);
        System.out.println(decimal);
    }
}
