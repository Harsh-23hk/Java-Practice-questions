package String;

import java.util.Scanner;

public class ReverseCharacter {

    public static String reverseCharacter(String input) {
        String rev = "";
        String[] wordSplit = input.split(" ");
        for (String word : wordSplit) {
            for (int j = word.length() - 1; j >= 0; j--) {
                rev = rev + word.charAt(j);
            }
            rev = rev + " ";
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String input = sc.nextLine();
        System.out.println(reverseCharacter(input));
    }

}
