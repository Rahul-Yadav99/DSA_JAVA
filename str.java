public class str {
    public static void main(String[] args) {
        // printAllSubStrings("abc");
        // System.out.println(indexOfSubstring("rahul", "l"));
        printSubString("main", "sub");
    }

    public static void printAllSubStrings(String str) {
        for (int si = 0; si < str.length(); si++) {
            for (int ei = si + 1; ei <= str.length(); ei++) {
                System.out.println(str.substring(si, ei));
            }
        }
    }

    public static int indexOfSubstring(String main, String sub) {
        for (int i = 0; i <= main.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (main.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == sub.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void printSubString(String main, String sub) {
        int m = main.length();
        int n = sub.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= m - n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (main.charAt(i + j) != sub.charAt(j)) {
                    break;
                }else{
                    sb.append(main.charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}