import java.util.Arrays;

public class bt {
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }
}