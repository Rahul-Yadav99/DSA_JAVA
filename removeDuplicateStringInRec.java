public class removeDuplicateStringInRec {
    public static void main(String[] args) {
        String str = "rahull";
        fun(str, new StringBuilder(""), 0, new boolean[26]);
    }

    public static void fun(String str, StringBuilder newStr, int index, boolean map[]) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        if (map[currChar - 'a'] == true) {
            fun(str, newStr, index + 1, map);
        } else {
            map[currChar - 'a'] = true;
            fun(str, newStr.append(currChar), index + 1, map);
        }
    }
}