package com.web.java_dsa.javalearn.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritePersonalInfoToFile {
    public static void main(String[] args) throws IOException {
        // Mustaqil topshiriq: faylga o‘z ismingiz, familiyangiz va kasbingizni yozing.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ismingizni kiriting: ");
        String firstName = scanner.next();
        System.out.print("Familiyangizni kiriting: ");
        String lastName = scanner.next();
        System.out.print("Kasbingizni kiriting: ");
        String job = scanner.next();
        try {
            FileWriter writer = new FileWriter("src/main/java/com/web/java_dsa/javalearn/files/employee.txt");
            writer.write("Firstname: " + firstName + "\nLastname: " + lastName + "\nJob: " + job);
            System.out.print("Successfully wrote to the file");
            writer.close();
        } catch (IOException exception){
            throw new IOException(exception);
        }
    }
}
