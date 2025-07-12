public class friendsPairingProblem {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fun(n));
    }

    public static int fun(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int fnm1 = fun(n - 1);
        int fnm2 = fun(n - 2);
        int pairWays = (n - 1) * fnm2;
        int totalWays = pairWays + fnm1;
        return totalWays;
    }
}