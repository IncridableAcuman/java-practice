package com.web.java_dsa.javalearn.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSize {
    public static void main(String[] args) throws IOException {
        try {
            Path path = Path.of("src/main/java/com/web/java_dsa/javalearn/files/employee.txt");
            long size = Files.size(path);
            System.out.println("File size: " + size + " byte");
        } catch (IOException exception){
            throw new IOException(exception);
        }
    }
}
