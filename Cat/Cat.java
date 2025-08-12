import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 1) {
            String path = args[0];
            FileInputStream fis = new FileInputStream(path);
            byte[] buffer = fis.readAllBytes();
            System.out.write(buffer);
            fis.close();
        } else {
            System.out.print("");
        }
    }
}
