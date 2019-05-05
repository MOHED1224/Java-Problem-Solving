import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RoundWord {

    // This code is used to check whether the two given words are rounded from each other
    // This means that the 2 words have the same length and and same letters with the same number of occurrences.
    // e.g: "own" - "now" are rounded.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = scan.nextLine();
        System.out.println("Enter second word: ");
        String word2 = scan.nextLine();

        Map<Character, Integer> numChars1 = new HashMap<Character, Integer>();
        Map<Character, Integer> numChars2 = new HashMap<Character, Integer>();

        // First we need to check that the two words have the same length
        if(word1.length() == word2.length()){
            for(int i=0; i<word1.length() ; i++){ // Loop over the word
                char c = word1.charAt(i);
                char c2 = word2.charAt(i);
                if(numChars1.containsKey(c)){ // Save all letters of word 1 and number of occurrences of its letters in HashMap numChars1
                    numChars1.put(c, numChars1.get(c)+1);
                } else{
                    numChars1.put(c, 1);
                }

                if(numChars2.containsKey(c2)){ // Save all letters of word 2 and number of occurrences of its letters in HashMap numChars2
                    numChars2.put(c2, numChars2.get(c2)+1);
                } else{
                    numChars2.put(c2, 1);
                }
            }

            // If numChars1 == numChars2, so two words are round rotated.
            if(numChars1.equals(numChars2)){
                System.out.println("Word 2 is round rotation of word 1");
            } else{
                System.out.println("Word 2 is not round rotation of word 1");
            }
        } else{
            System.out.println("Word 1 and word 2 are not the same length!\nNot round rotation");
        }
    }
}
