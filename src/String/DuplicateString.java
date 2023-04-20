package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class DuplicateString {

    public static void findDuplicateWord(String str) {
        Map<String, Integer> hm = new HashMap<>();//creating a hashmap
        String[] wordSplit = str.split(" ");
        for (String word : wordSplit) { //for each word in the string
            if (hm.get(word) != null) { //if the word is already in the hashmap
                hm.put(word, hm.get(word) + 1);//adding the word to the hashmap
            } else { //if the word is not in the hashmap
                hm.put(word, 1);//putting the word in the hashmap
            }
        }
        Iterator<String> tempString = hm.keySet().iterator();
        while (tempString.hasNext()) {
            String temp = tempString.next();
            if (hm.get(temp) > 1) {
                System.out.println(" the word " + " " + temp + " " + " appeared " + hm.get(temp) + " " + " times ");
            }
        }
    }

    public static void duplicateCharacter(String dupCheck) {
        Map<Character, Integer> charmap = new HashMap<>();
        for (int i = 0; i < dupCheck.length(); i++) {
            char c = dupCheck.charAt(i);
            if (charmap.get(c) != null) {
                charmap.put(c, charmap.get(c) + 1);
            } else {
                charmap.put(c, 1);
            }
        }
        System.out.println(charmap);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check");
        String str = sc.nextLine();
        System.out.println("Enter the string to check Duplicate");
        String dupCheck = sc.nextLine();
        findDuplicateWord(str);
        duplicateCharacter(dupCheck);

    }
}
