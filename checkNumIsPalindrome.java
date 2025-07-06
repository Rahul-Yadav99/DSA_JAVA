public class checkNumIsPalindrome {
    public static void main(String[] args) {
        int n = 12;
        if (n < 0) {
            System.out.println("Number is not a palindrome");
        }
        String str = Integer.toString(n);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("Number is not a palindrome");
            }
            left++;
            right--;
        }
        System.out.println("Number is a palindrome");
    }
}
