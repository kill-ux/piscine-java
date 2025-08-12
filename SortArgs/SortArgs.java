import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        // for (int i = 0; i < args.length; i++) {
        //     for (int j = 0; j < args.length; j++) {
        //         if (args[i].compareTo(args[j]) < 0) {
        //             String temp = args[i];
        //             args[i] = args[j];
        //             args[j] = temp;
        //         }
        //     }
        // }
        Arrays.sort(args);
        System.out.println(String.join(" ", args));
    }
}