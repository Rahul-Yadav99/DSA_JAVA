public class Loop {
    public static void main(String[] args) {
        int arr[][] = {
                { 2, 1, 4 },
                { 4, 3, 100 }
        };
        int x = 100;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == x) {
                    System.out.println(i + " is row and coloum is " + j);
                    break;
                }
            }
            // System.out.println();
        }
    }
}