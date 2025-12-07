public class Rotate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 2;
        int n = arr.length;

        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k);
        reverse(arr, k + 1, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
