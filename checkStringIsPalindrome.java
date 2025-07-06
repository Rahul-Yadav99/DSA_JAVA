public class checkStringIsPalindrome {
    public static boolean ispld(String pld) {
        for (int i = 0; i < pld.length() / 2; i++) {
            if (pld.charAt(i) != pld.charAt(pld.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pld = "adda";
        boolean isPalindrome = ispld(pld);
        if (isPalindrome) {
            System.out.println(pld + " is a palindrome");
        } else {
            System.out.println(pld + " is not a palindrome");
        }
    }
}