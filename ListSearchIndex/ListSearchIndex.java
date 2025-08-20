import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null)
            return null;
        int index = list.lastIndexOf(value);
        return index == -1 ? null : index;
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null)
            return null;
        int index = list.indexOf(value);
        return index == -1 ? null : index;
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        if (list == null)
            return null;
        List<Integer> allIndexes = new ArrayList<>();
        int index = 0;
        for (Integer ele : list) {
            if (ele.equals(value)) {
                allIndexes.add(index);
            }
            index++;
        }
        return allIndexes;
    }
}