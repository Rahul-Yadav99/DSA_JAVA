public class tilingProblem {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(fun(n));
    }

    public static int fun(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        int fnm1 = fun(n - 1);

        // horizontal choice
        int fnm2 = fun(n - 2);

        return fnm1 + fnm2;
    }
}