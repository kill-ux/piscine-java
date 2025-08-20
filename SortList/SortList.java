
import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        list.sort(null);
        return list;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        list.sort((x, y) -> y.compareTo(y));
        return list;
    }
}