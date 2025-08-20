import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        Map<String, String> map = new HashMap<>();
        Iterator<String> iter = second.iterator();
        int index = 0; 
        for (String ele : first) {
            if (index >= second.size()) {
                break;
            }
            map.put(ele, iter.next());
            index++;
        }
        return map;
        
    }
}