public class findSubsets {
    public static void main(String[] args) {
        String str = "abc";
        find_subsets(str, "", 0);
    }

    public static void find_subsets(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        // yes choice
        find_subsets(str, ans + str.charAt(i), i + 1);
        // no choice
        find_subsets(str, ans, i + 1);
    }
}