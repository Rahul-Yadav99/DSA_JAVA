public class ReverseArr {
    public static void main(String[] args) {
        int arr[] = { 2, 9, 8, 7, 6 };
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
