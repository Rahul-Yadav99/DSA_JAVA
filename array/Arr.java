public class Arr {
    public static void main(String[] args) {
        int n[] = { 1, 2, 4, 5, 3 };
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }

            }
        }
        System.out.println("Array in descending order:");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}