import java.util.ArrayList;

public class KsubMax {

    public static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        System.out.println(arr.length);
        if (k == 1) {
            for (int i : arr) {
                res.add(i);
            }
            return res;
        }

        for (int i = 0; i <= arr.length - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            res.add(max);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        System.out.println(maxOfSubarrays(arr, k));
    }
}
