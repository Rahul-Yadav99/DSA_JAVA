
public class practice {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 1, 0 };
        int arr1[] = { 1, 3, 4, };
        int arr2[] = { 2, 6, 1, 5, 5, 5 };
        print_zeros_ones(arr);
        System.out.println();
        System.out.println("--------------------------------------------------");
        merge_two_arrays(arr1, arr2);
    }

    public static void print_zeros_ones(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge_two_arrays(int arr1[], int arr2[]) {
        int newArr[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[i] > newArr[j]) {
                    int temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}