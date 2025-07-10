public class countVowelsInString {
    public static void main(String[] args) {
        String str = "Hello world";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Total vowels " + count);
        } else {
            System.out.println("No Vowels are present in this given String");
        }
        System.out.println((5<<2));
        System.out.println((5>>2));
    }
}