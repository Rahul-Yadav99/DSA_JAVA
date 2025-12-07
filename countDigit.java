public class countDigit {
    public static void main(String[] args) {
        int n = 2222222, count = 0;
        if (n == 0) {
            System.out.println(1);
            return;
        }
        while (n != 0) {
            n = n / 10;
            count = count + 1;
        }
        System.out.println(count);
    }
}
