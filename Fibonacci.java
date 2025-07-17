public class Fibonacci {
    public static void main(String[] args) {
        int n = 11;
        int x = 4;
        String str = "rahul";
        int result = fib(x);
        System.out.println("Fibonacci number at position " + x + " is: " + result);
        int sum = sumOfDigit(n);
        System.out.println(sum);
        String res = revString(str);
        System.out.println(res);
        int findPower = powerOfN(10);
        System.out.println(findPower);
        printNaturalNum(n);
        System.out.println();
        fun(n);
    }

    public static int fib(int n) {
        // f(n) = f(n-1) + f(n-2)
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static int sumOfDigit(int n) {
        if (n == 0) {
            return 0;
        }
        int x = (n % 10) + sumOfDigit(n / 10);
        return x;
    }

    public static String revString(String str) {

        // base case
        if (str.length() == 1 || str.length() == 0) {
            return str;
        }
        return revString(str.substring(1)) + str.charAt(0);
    }

    public static int powerOfN(int n) {
        if (n == 0) {
            return 1;
        }

        return 2 * powerOfN(n - 1);
    }

    public static void printNaturalNum(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printNaturalNum(n - 1);
        System.out.print(n + " ");
    }

    public static void fun(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        fun(n - 1);
    }
}