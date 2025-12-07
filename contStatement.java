public class contStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 14 || i == 27)
                continue;
            if (i % 2 == 0 || i % 3 == 0)
                System.out.print(i + " ");
        }
    }
}
