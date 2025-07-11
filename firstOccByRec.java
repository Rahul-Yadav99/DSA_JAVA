public class firstOccByRec {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3, 2, 5 };
        // int index = fun(arr, 3, 0);
        int index = findLastOcc(arr, 3, 0);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("key not found");
        }
    }

    public static int fun(int arr[], int key, int index) {
        if (arr[index] == arr.length - 1) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }
        return fun(arr, key, index + 1);
    }

    // 1, 2, 3, 4, 3, 2, 5
    public static int findLastOcc(int arr[], int key, int index) {
        if (index == arr.length - 1) {
            return -1;
        }
        int isFound = findLastOcc(arr, key, index + 1);
        if (isFound == -1 && arr[index] == key) {
            return index;
        }
        return isFound;
    }
}