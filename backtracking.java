public class backtracking {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");
        int i = 0;
        printPermutation(str, i);
    }

    public static void printPermutation(StringBuilder str, int i) {
        if (str.length() <= i) {
            System.out.print(str.toString() + " ");
            return;
        }
        // Swapping
        for (int j = i; j < str.length(); j++) {
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);

            // Recurse
            printPermutation(str, i + 1);

            // Backtrack (swap back)
            temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);
        }
    }
}