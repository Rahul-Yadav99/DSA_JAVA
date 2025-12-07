public class findMaxEle {
    public static void main(String[] args) {
        int arr[] = { -5, -8, -9, -7, -5, -3, -10 };
        int maxEle = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
        }
        System.out.println(maxEle + " is max element in the given arr");
    }
}
