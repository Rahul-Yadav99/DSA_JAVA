public class isSortedArrayByRec {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 4, 5 };
        boolean res = isSort(arr, 0);
        if (res) {
            System.out.println("arr is sorted");
        } else {
            System.out.println("arr is not sorted");
        }
    }

    public static boolean isSort(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSort(arr, index + 1);
    }
}