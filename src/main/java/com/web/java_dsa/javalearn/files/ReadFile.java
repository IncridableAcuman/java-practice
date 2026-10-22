package com.web.java_dsa.javalearn.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/com/web/java_dsa/javalearn/files/newfile.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException exception){
            throw new FileNotFoundException(exception.getMessage());
        }
        try {
            Path path = Path.of("src/main/java/com/web/java_dsa/javalearn/files/newfile.txt");
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
