package com.web.java_dsa.javalearn.files;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteToAFile {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter writer = new FileWriter("src/main/java/com/web/java_dsa/javalearn/files/newfile.txt");
            writer.write("I can do it");
            writer.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException exception){
            throw new IOException((exception));
        }
        // second
        try (FileWriter writer = new FileWriter("src/main/java/com/web/java_dsa/javalearn/files/newfile.txt")) {
            writer.write("I can do it");
            writer.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException exception){
            throw new IOException((exception));
        }
        try (FileWriter writer = new FileWriter("src/main/java/com/web/java_dsa/javalearn/files/newfile.txt",true)) {
            writer.write("\nInsha Allah");
            writer.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException exception){
            throw new IOException((exception));
        }
        try {
            Path path = Path.of("src/main/java/com/web/java_dsa/javalearn/files/newfile.txt");
            Files.writeString(path,"I am from Uzbekistan");
            System.out.println("Successfully wrote to the file");
        } catch (IOException exception){
            throw new IOException(exception);
        }
    }
}
