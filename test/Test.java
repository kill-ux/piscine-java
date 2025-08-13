
import java.io.FileInputStream;
import java.io.IOException;
public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        System.out.println("File opened, FD exists now");

        // Pause to inspect
        System.in.read(); // Wait for Enter key

        fis.close(); // Explicit close
    }
}
