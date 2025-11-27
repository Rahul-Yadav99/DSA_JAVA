import java.util.Scanner;

public class Gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int s = 1, d = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(s + " ");
            s = s * d;
        }
    }
}
