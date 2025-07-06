import java.util.Scanner;

public class str {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c' };
        // String str = "rahul";
        // String str2 = new String("yadav");
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
        // String fullName, LastName;
        // System.out.println(fullName.length());
        // fullName = "Rahul";
        // LastName = "Yadav";
        // System.out.println(fullName.charAt(0) + " " + LastName.charAt(0));
        String str = "Rahul Yadav";
        printLetters(str);
    }
}
