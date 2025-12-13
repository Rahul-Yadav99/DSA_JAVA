public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 4, 1 };
        int k = 3;
        int winSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            winSum = winSum + arr[i];
        }
        maxSum = winSum;
        for (int i = k; i < arr.length; i++) {
            winSum = winSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, winSum);
        }
        System.out.println(maxSum);
    }
}
