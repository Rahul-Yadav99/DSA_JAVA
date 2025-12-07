public class Factor {
    public static void main(String[] args) {
        int n = 24;
        int hf = 1;
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                hf = i;
                break;
            }
        }
        System.out.println(hf);
    }
}
