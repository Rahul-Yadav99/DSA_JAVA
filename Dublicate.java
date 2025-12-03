public class Dublicate {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 4, 2, 2 };
        // boolean isDuplicate = true;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] == arr[j]) {
        // System.out.println(arr[i]);
        // isDuplicate = false;
        // break;
        // }
        // }
        // if (isDuplicate == false) {
        // break;
        // }
        // }
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int s = n * (n - 1) / 2;
        int duplicate = sum - s;
        System.out.println(duplicate);
    }
}
