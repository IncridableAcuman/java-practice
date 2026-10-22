package com.web.java_dsa.javalearn.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class AppendNewContentToExistsFile {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/java/com/web/java_dsa/javalearn/files/employee.txt");
        try {
            Files.writeString(path, "\nLocation: Uzbekistan" ,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
            System.out.println("Successfully wrote new content to the file");
        } catch (IOException exception){
            throw new IOException(exception);
        }
    }
}
