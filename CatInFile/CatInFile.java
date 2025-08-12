import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(args[0]);
        fos.write(System.in.readAllBytes());
        fos.close();
    }
}