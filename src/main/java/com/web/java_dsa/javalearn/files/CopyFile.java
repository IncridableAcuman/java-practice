package com.web.java_dsa.javalearn.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        Path source = Path.of("src/main/java/com/web/java_dsa/javalearn/files/info.txt");
        Path target = Path.of("src/main/java/com/web/java_dsa/javalearn/files/personal.txt");
        Files
                .copy(source,target, StandardCopyOption.REPLACE_EXISTING);

        System.out.print("File copied");
    }
}

