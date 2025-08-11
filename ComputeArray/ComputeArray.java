import java.util.Arrays;

public class ComputeArray {
    public static int[] computeArray(int[] array) {
        if (array == null) {
            return null;
        }
        return Arrays.stream(array).map(ele -> {
            if (ele % 3 == 0) {
                return ele * 5;
            } else if (ele % 3 == 1) {
                return ele + (ele > 0 ? 7 : -7);
            } else {
                return ele;
            }
        }).toArray();
    }
}