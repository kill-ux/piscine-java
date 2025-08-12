import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 1) {
            FileInputStream fis = new FileInputStream(args[0]);
            System.out.write(fis.readAllBytes());
            fis.close();
        } else {
            System.out.print("");
        }
    }
}
