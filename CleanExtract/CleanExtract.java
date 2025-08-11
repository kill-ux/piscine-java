public class CleanExtract {
    public static String extract(String s) {
        String[] splitbyPipe = s.split("\\|");
        String res = "";

        for (String str : splitbyPipe) {
            int index1 = str.indexOf(".");
            int index2 = str.lastIndexOf(".");
            res = res.trim();
            if (index1 != index2) {
                String res_str = str.substring(index1 + 1, index2);
                res += " " + res_str.trim() + " ";
            } else {
                String res_str = index1 != -1 ? str.substring(index1 + 1) : str;
                res += " " + res_str.trim() + " ";
            }
        }
        return res.trim();
    }
}