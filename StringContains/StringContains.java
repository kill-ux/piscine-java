public class StringContains {
    public static boolean isStringContainedIn(String subString, String s) {
        return (s == null || subString == null) ? false : s.contains(subString);
    }
}