package com.web.java_dsa.javalearn.strings;

import java.util.Scanner;

public class StringniTeskariQiling {
    public static void main(String[] args) {
        // Stringni teskari qiling.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        System.out.print(sb);
    }
}
