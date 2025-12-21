import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Rahul Yadav");
        int arr[] = { 1, 2, 3, 3, 4, 5 };
        boolean hasDuplicate = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                hasDuplicate = true;
                break;
            }
        }
        System.out.println(hasDuplicate);
    }
}
