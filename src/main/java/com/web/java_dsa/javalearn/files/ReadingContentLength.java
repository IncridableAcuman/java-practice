package com.web.java_dsa.javalearn.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingContentLength {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/com/web/java_dsa/javalearn/files/employee.txt");
        int length = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()){
                String content = scanner.nextLine();
                length+=content.length();
            }
            System.out.println("Content length: " + length);
        } catch (FileNotFoundException exception){
            throw new FileNotFoundException(exception.getMessage());
        }
    }
}
