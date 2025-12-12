public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 4, 1 };
        int msum = Integer.MIN_VALUE;
        int k = 3;
        for (int i = 0; i <= arr.length - k; i++) {
            int csum = 0;
            for (int j = i; j < i + k; j++) {
                csum += arr[j];

            }
            if (csum > msum) {
                msum = csum;
            }
        }
        System.out.println(msum);
    }
}
