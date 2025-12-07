public class Doublet {
    public static void main(String[] args) {
        int arr[] = { 2, 9, 8, 7, 6 };
        int x = 13;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + ", " + arr[j]);
                    break;
                }
            }
        }
    }
}
