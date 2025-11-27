import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = n; i <= n * 10; i++) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
    }
}
