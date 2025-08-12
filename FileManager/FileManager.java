
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        Files.createFile(Paths.get(fileName));
        Files.writeString(Paths.get(fileName), content);
    }

    public static String getContentFile(String fileName) throws IOException {
        String res = Files.readString(Paths.get(fileName));
        return res;
    }

    public static void deleteFile(String fileName) {
        try {
            Files.delete(Paths.get(fileName));
        } catch (Exception e) {
        }

    }
}