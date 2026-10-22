package com.web.java_dsa.javalearn.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RenameFile {
    public static void main(String[] args) throws IOException {
        Path source = Path.of("src/main/java/com/web/java_dsa/javalearn/files/employee.txt");
        Path target = Path.of("src/main/java/com/web/java_dsa/javalearn/files/info.txt");

        try {
            Files.move(source,target);
            System.out.println("File renamed");
        } catch (IOException exception){
            throw new IOException(exception);
        }
    }
}
