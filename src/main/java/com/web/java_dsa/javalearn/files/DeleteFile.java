package com.web.java_dsa.javalearn.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
//        File file = new File("src/main/java/com/web/java_dsa/javalearn/files/newfile.txt");
//        if (file.delete()){
//            System.out.println("Deleted the file: " + file.getName());
//        } else {
//            System.out.println("Failed to delete the file");
//        }
        try {
            Path path = Path.of("src/main/java/com/web/java_dsa/javalearn/files/employee.txt");
            boolean isDeleted = Files.deleteIfExists(path);
            if (isDeleted){
                System.out.println("File deleted");
            } else {
                System.out.println("Failed to delete the file");
            }
        } catch (IOException exception){
            throw new IOException(exception);
        }
    }
}
