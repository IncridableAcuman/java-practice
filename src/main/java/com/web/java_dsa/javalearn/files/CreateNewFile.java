package com.web.java_dsa.javalearn.files;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("src/main/java/com/web/java_dsa/javalearn/files/newfile.txt");
            if (file.createNewFile()){
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException exception){
            throw new IOException(exception);
        }
    }
}
