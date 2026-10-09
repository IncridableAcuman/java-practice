package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class OqVaQoraToshlar {
    public static void main(String[] args) {
        // Oq va qora toshlar
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print(w == b ? 0 : w > b ? (w - b) - 1 : (b - w) - 1);
    }
}
