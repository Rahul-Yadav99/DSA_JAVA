public class rec {
    public static void printN(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printN(n - 1);
    }

    public static void printNInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printNInc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printN(5);
        System.out.println(" ");
        printNInc(5);
    }
}