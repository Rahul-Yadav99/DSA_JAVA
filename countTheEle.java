public class countTheEle {
    public static void main(String[] args) {
        int arr[] = { 2, 9, 8, 7, 6 };
        int x = 9;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x)
                count++;
        }
        System.out.println(count);
    }
}
