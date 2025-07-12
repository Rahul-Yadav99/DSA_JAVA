public class binaryStringProblem {
    public static void main(String[] args) {
        fun(2, 0, "");
    }

    public static void fun(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        fun(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            fun(n - 1, 1, str + "1");
        }
    }
}