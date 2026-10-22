package com.web.java_dsa.javalearn.files;

import java.util.Scanner;

public class ExtractFileExtension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.next();
        String extension = filename.substring(filename.indexOf("."));
        System.out.println(extension);
    }
}
