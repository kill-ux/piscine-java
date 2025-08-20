
import java.util.ArrayList;
import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        if (list == null) return null;
        List<Integer> l = new ArrayList<>(list);
        l.sort(null);
        return l;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list == null) return null;
        List<Integer> l = new ArrayList<>(list);
        l.sort((x, y) -> y.compareTo(x));
        return l;
    }
}