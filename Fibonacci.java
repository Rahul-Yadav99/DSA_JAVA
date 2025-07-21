public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int x = 14;
        String str = "rahul";
        int result = fib(x);
        System.out.println("Fibonacci number at position " + x + " is: " + result);
        int sum = sumOfDigit(n);
        System.out.println("sum " + sum);
        String res = revString(str);
        System.out.println(res);
        int findPower = powerOfN(10);
        System.out.println(findPower);
        printNaturalNum(n);
        System.out.println();
        fun(n);
        System.out.println();
        printMulti(5, 1);
        System.out.println();
        int al = alternateSigns(n);
        System.out.println(al);
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

    // 12 24 36 48 60
    public static void printMulti(int num, int k) {
        if (k == 0) {
            return;
        }
        printMulti(num, k - 1);
        System.out.print((num * k) + " ");
    }

    public static int alternateSigns(int n) {
        // 1-2+3-4+5 = 3
        if (n == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return alternateSigns(n - 1) - n;
        } else {
            return alternateSigns(n - 1) + n;
        }
    }
}