import java.util.Scanner;

public class MyFlow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        if (marks > 100 || marks < 0) {
            System.out.println("please enter your correct marks");
            return;
        }
        if (marks >= 90) {
            System.out.println("you are toper as you have secured " + marks);
        } else if (marks > 35 && marks < 90) {
            System.out.println("Your marks is : " + marks);
        } else if (marks <= 35) {
            System.out.println("you are failed with : " + marks);
        } else {
            System.out.println("you are absent in exam");
        }

        String name = "rahul";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is vowel");
            } else {
                System.out.println(ch + " is not vowel");
            }
        }
    }
}
