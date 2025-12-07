public class BinarySearch {
    public static int Bs(int[] arr, int key) {
        int l = 0, h = arr.length - 1, mid = 0;
        while (l <= h) {
            mid = (l + h) / 2;
            if (key == arr[mid])
                return mid;
            else if (key < arr[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int key = 5;
        System.out.println(Bs(arr, key));
    }
}
