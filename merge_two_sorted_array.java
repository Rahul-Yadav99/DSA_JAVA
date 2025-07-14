
import java.util.Arrays;

public class merge_two_sorted_array {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 20 };
        int arr2[] = { 4, 5 };
        int newArr[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
}