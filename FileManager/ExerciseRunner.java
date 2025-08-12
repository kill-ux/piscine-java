
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.IOException;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        FileManager.createFile("file.txt", "Lorem ipsum");
        System.out.println(FileManager.getContentFile("file.txt"));
        FileManager.deleteFile("file.txt");
    }
}