public class reverse_integer {
    public static void main(String[] args) {
        int num = -123;
        int ans = 0;
        int rem = 0;
        boolean isNeg = false;
        if (num < 0) {
            isNeg = true;
            num = num * -1;
        }
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
