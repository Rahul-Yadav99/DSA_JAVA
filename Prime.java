import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (n == 1){
            System.out.println("Neither Prime nor Composite");
            return;
        }
        
        if (isPrime == true)
            System.out.println(n + " is prime number");
        else
            System.out.println(n + " is composite number");
    }
}
