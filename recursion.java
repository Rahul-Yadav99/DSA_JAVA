public class recursion {
    public static void main(String[] args) {
        int n = 5;
        int x = 6;
        System.out.println("It's calculate the " + factorila(n));
        System.out.println("-------");
        System.out.println("It's calculate the sum of N natural numbers " + sumOfN(x));
        System.out.println("-------");
        printNumInc(n);
        System.out.println();
        System.out.println("-------");
        printNumDec(n);
        System.out.println();
        System.out.println("-------");
    }

    // 4.3!
    public static int factorila(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorila(n - 1);
    }

    // 1+2+3+4+5=15
    public static int sumOfN(int x) {
        if (x == 0) {
            return 0;
        }
        return x + sumOfN(x - 1);
    }

    // 1,2,3,4,5
    public static void printNumInc(int n) {
        if (n == 0) {
            return;
        }
        printNumInc(n - 1);
        System.out.print(n + " ");
    }

    // 5,4,3,2,1
    public static void printNumDec(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumDec(n - 1);
    }
}