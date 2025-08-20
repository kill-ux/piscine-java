import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        int index = list.indexOf(value);
        return index == -1 ? null : index;
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        int index = list.lastIndexOf(value);
        return index == -1 ? null : index;
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> allIndexes = new ArrayList<>();
        ijtSD = 
        for (Integer ele : list) {
            if (ele.equals(value)) {
                allIndexes.add();
            }
        }
    }
}