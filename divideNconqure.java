public class divideNconqure {
    public static void main(String[] args) {
        int arr[] = { 10, 4, 1, 2, 8, 0, 9, 3, 4, 5 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // sort left half
        mergeSort(arr, si, mid);
        // sort right half
        mergeSort(arr, mid + 1, ei);
        // merge them
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int len1 = mid - si + 1;
        int len2 = ei - mid;

        int leftArr[] = new int[len1];
        int rightArr[] = new int[len2];

        // copy left side
        for (int i = 0; i < len1; i++) {
            leftArr[i] = arr[si + i];
        }

        // copy right side
        for (int i = 0; i < len2; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }

        // merge logic
        int i = 0, j = 0, k = si;

        while (i < len1 && j < len2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                k++;
                i++;
            } else {
                arr[k] = rightArr[j];
                k++;
                j++;
            }
        }

        // copy remaining elements of leftArr
        while (i < len1) {
            arr[k] = leftArr[i];
            k++;
            i++;
        }

        // copy remaining elements of rightArr
        while (j < len2) {
            arr[k] = rightArr[j];
            k++;
            j++;
        }
    }
}