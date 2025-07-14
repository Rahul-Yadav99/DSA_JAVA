
import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int arr[] = { 8, 1, 3, 4, 20, 30, 50 };
        int piv = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[piv] > arr[i]) {
                int temp = arr[piv];
                arr[piv] = arr[count];
                arr[count] = temp;
            }
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
