public class StringConcat {
    public static String concat(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return null;
        }
        String str1 = s1 == null ? "" : s1;
        String str2 = s2 == null ? "" : s2;
        return str1 + str2;
    }
}