public class printXn {
    public static void main(String[] args) {
        int x = 2;
        int n = 2;
        System.out.println(print(x, n));
    }

    public static int print(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * print(x, n - 1);
    }
}