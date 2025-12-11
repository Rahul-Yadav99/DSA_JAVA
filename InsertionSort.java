public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 2, 4 };
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > temp;) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}