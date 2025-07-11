public class printFactorialUsingRec {
    public static int fac(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fac(n - 1);
        int fn = n * fac(n - 1);
        return fn;
    }

    public static int sumOfnNatural(int n) {
        if (n == 1) {
            return 1;
        }
        int sum1 = sumOfnNatural(n - 1);
        int sum = n + sum1;
        return sum;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(fac(n));
        System.out.println(sumOfnNatural(100));
    }
}