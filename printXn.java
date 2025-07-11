public class printXn {
    public static void main(String[] args) {
        int x = 25;
        int n = 10;
        System.out.println(print(x, n));
    }

    public static int print(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * print(x, n - 1);
    }
}