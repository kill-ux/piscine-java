public class RegexReplace {
    public static String removeUnits(String s) {
        return s.replaceAll("(?<=\\d+)(cm|€)(?= |$)", "");
    }

    public static String obfuscateEmail(String s) {
        String[] array = s.split("@");
        String user = "";
        String first = array[0];
        if (first.length() > 3) {
            user =  first.substring(0, Math.max(0, first.length() - 3)) + "*".repeat(Math.min(3, first.length()));
        } else {
            user = array[0].replaceAll("(?<=[-|.|_]).", "*");
        }
        String secend = array[1].replaceAll("((.)(?=.*\\..*\\..*))|((?<=.*\\..*\\..*)(.))","*");
        return user + "@" + secend;
    }
}