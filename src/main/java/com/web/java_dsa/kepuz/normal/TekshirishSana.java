package com.web.java_dsa.kepuz.normal;

import java.util.Scanner;

public class TekshirishSana {
    public static void main(String[] args) {
        // https://kep.uz/problems/199
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String regex = "\\d{2}/\\d{2}/\\d{4}";
        System.out.println(text.matches(regex) ? "Yes" : "No");
    }
}
