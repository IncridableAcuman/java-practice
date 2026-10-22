package com.web.java_dsa.javalearn.files;

import java.io.File;

public class FileMethods {
    public static void main(String[] args) {
        try {
            File file = new File("src/main/java/com/web/java_dsa/javalearn/files/matn.txt");
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Filename: " + file.getName());
            System.out.println("Can read: " + file.canRead());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Length: " + file.length());
            System.out.println("List: " + file.list());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
