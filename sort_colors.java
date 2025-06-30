public class sort_colors {
    public static void main(String[] args) {
        int color[] = { 2, 0, 3, 2, 1, 3, 1, 0 };
       
        for (int i = 0; i < color.length; i++) {
            for (int j = i + 1; j < color.length; j++) {
                if (color[i] > color[j]) {
                    int temp = color[i];
                    color[i] = color[j];
                    color[j] = temp;
                }
            }
        }
        for (int i = 0; i < color.length; i++) {
            System.out.print(color[i] + " ");
        }
    }
}