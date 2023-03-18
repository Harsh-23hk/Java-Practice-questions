package String;

import java.util.Scanner;

public class Reverse {

    public static String reverseString(String input) {
        String rev = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String input = sc.nextLine();
        System.out.println(reverseString(input));
    }
}
