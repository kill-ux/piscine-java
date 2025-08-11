import java.util.Arrays;

public class ComputeArray {
    public static int[] computeArray(int[] array) {
        return Arrays.stream(array).map(ele -> {
            if (ele % 3 == 0) {
                return ele * 5;
            } else if (ele - 1 % 3 == 0) {
                return ele + 7;
            } else {
                return ele;
            }
        }).toArray();
    }
}