package com.web.java_dsa.javalearn.files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class GetFilename {
    public static void main(String[] args) {
        // Mustaqil topshiriq: foydalanuvchidan fayl nomini oling va uning mavjudligini tekshiring.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fayl nomini kiriting: ");
        String filename = scanner.next();
        Path path = Path.of(filename);
        if (Files.exists(path)){
            System.out.println("File exist");
        }else {
            System.out.println("File does not exist");
        }
    }
}
