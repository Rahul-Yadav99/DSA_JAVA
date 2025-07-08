public class sortestPathInString {
    public static int getPath(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            }
        }
        double result = Math.sqrt(x * x + y * y);
        return (int) result;
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("Shortest Path is " + getPath(str));
    }
}