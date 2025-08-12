import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearch {
    public static String searchFile(String fileName) {
        List<File> paths = new ArrayList();
        File directory = new File("documents");
        paths.add(directory);

        while (!paths.isEmpty()) {
            File dir = paths.remove(0);
            if (dir.isDirectory()) {
                File[] files = dir.listFiles();
                if (files != null) {
                    for (File file : files) {
                        if (file.getName().equals(fileName)) {
                            return file.getPath();
                        }
                        paths.add(file);
                    }
                }
            }
        }
        return "";

    }
}