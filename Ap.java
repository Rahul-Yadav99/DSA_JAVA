import java.util.Scanner;

public class Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        // for (int i = 1; i <= (n * 2) - 1; i += 2) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // System.out.println("-------------------------------------");
        // for (int i = 4; i <= (n * 3) + 1; i += 3) {
        // System.out.print(i + " ");
        // }
        int a = 4, d = 3;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a += d;
        }
    }
}
