public class subString {
    public static String subStringg(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr = subStr + str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subStringg(str, 0, 10));
    }
}