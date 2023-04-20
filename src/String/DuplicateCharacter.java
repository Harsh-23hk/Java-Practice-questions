package String;

import java.util.Scanner;

public class DuplicateCharacter {

    public static void checkDuplicate(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) { // for loop to check each character
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) { //if a character is repeated then print the character
                    System.out.println(ch[i]);
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check");
        String str = sc.nextLine();
        checkDuplicate(str);

    }

}
