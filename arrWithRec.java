public class arrWithRec {
    public static void print(int arr[], int i) {
        if (i >= arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        print(arr, i + 1);
    }

    public static void printMax(int arr[], int i, int max) {
        if (i >= arr.length) {
            System.out.println(max);
            return;
        }

        if (max < arr[i]) {
            max = arr[i];
        }

        printMax(arr, i + 1, max);
    }

    public static void sumOfElements(int arr[], int i, int sum) {
        if (i >= arr.length) {
            System.out.println(sum);
            return;
        }
        sum = sum + arr[i];
        sumOfElements(arr, i + 1, sum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3 };
        int max = Integer.MIN_VALUE;
        int sum = 0;
        sumOfElements(arr, 0, sum);
    }
}