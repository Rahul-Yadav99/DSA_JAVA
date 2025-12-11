import java.util.*;

public class InbuiltSort {
    public static void main(String[] args) {
        int[] arr = { 40, 50, 30, 10, 20 };
        Arrays.sort(arr,1,5);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
