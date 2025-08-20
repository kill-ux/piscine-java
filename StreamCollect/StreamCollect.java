import java.util.*;
import java.util.stream.Stream;

public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        Map<Character, List<String>> map = new HashMap<>();
        s.forEach((w) -> {
            char ch = w.toUpperCase().charAt(0);
            if (!map.containsKey(ch)) {
                map.put(w.toUpperCase().charAt(0), new ArrayList<>());
            }
            map.get(ch).add(w);
        });
        return map;
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
        Map<Integer, Optional<Integer>> map = new HashMap<>();
        // map.put(0, Optional.empty());
        // map.put(1, Optional.empty());
        // map.put(2, Optional.empty());
        // map.put(3, Optional.empty());
        s.forEach((num) -> {
            Optional<Integer> unwrap = map.get(num % 4);
            if (unwrap.isPresent()) {
                map.put(num % 4, Optional.of(unwrap.get() > num ? unwrap.get() : num));
            } else {
                map.put(num % 4, Optional.of(num));
            }
        });
        return map;
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        return String.format("{%s}", String.join(" # ", s.sorted().toList()));
    }
}