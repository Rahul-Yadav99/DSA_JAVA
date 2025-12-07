public class InsertEleInArr {
    public static void main(String[] args) {
        int[] arr = { 90, 34, 25, 12, 22, 11, 64 };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
