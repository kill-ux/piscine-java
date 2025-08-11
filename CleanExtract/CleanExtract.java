public class CleanExtract {
    public static String extract(String s) {
        String[] splitbyPipe = s.split("\\|");
        String res = "";

        for (String str : splitbyPipe) {
            String[] splitbyPoint = str.split("\\.");
            if (!str.contains(".")) {
                res += " " + str.trim() + " ";
            } else {
                for (int i = 1; i < splitbyPoint.length; i += 2) {
                    if (!splitbyPoint[i].trim().isEmpty()) {
                        res = res.trim();
                        res += " " + splitbyPoint[i].trim() + " ";
                    }
                }
            }

        }
        return res.trim();
    }
}