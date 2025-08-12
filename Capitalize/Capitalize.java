import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        
        String content = Files.readString(Paths.get(args[0]));
        String[] res = Arrays.stream(content.split(" "))
                .filter(ele -> !ele.isEmpty())
                .map(ele -> ele.substring(0, 1).toUpperCase() + ele.substring(1).toLowerCase())
                .toArray(String[]::new);
        Files.writeString(Paths.get(args[1]), String.join(" ", res));
    }
}