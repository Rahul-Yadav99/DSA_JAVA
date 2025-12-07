public class linearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 22, 36, 4, 56, 78 };
        int x = 78;
        boolean isX = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                isX = true;
                break;
            }
        }
        if (isX) {
            System.out.println("X is present in the given arr");
        } else {
            System.out.println("X is not present in given arr");
        }
    }
}
