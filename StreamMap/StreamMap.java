import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        return s.reduce(0, (total, str) -> total + str.length(), Integer::sum);
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        return s.map(w -> w.toUpperCase()).toList();
    }

    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        return s.filter(num -> num > 42.).map(n -> (int) n.doubleValue()).collect(Collectors.toSet());
    }
}