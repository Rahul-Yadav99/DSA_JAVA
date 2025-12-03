public class Arr {
    public static void main(String args[]) {
        int arr[] = new int[5];
        System.out.println(arr.length + " length");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}