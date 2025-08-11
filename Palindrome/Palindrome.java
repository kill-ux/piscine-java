public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() % 2 == 0) {
            String s1 = s.substring(0, s.length() / 2).toLowerCase();
            String s2 = new StringBuffer(s.substring(s.length() / 2)).reverse().toString().toLowerCase();
            return s1.equals(s2);
        } else {
            String s1 = s.substring(0, s.length() / 2).toLowerCase();
            String s2 = new StringBuffer(s.substring((s.length() / 2) + 1)).reverse().toString().toLowerCase();
            return s1.equals(s2);
        }
    }
}