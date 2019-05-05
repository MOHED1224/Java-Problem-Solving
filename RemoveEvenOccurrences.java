import java.util.*;

public class RemoveEvenOccurrences {

    // In this code we remove the even occurrences of the letters from the string given

    public static void main(String[] args) {
        String s = "you got beautiful eyes";
        Map<Character, Integer> numChars = new HashMap<>();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);

            if(numChars.containsKey(c)){  // Check if the letter is in the list
                numChars.put(c, numChars.get(c)+1);
                if(numChars.get(c)%2 == 0){ // Check if the number of occurrences is even
                    sb.deleteCharAt(i); // Delete the letter and start again
                }
            }
            else{
                numChars.put(c, 1); // Add letter to the list
            }
        }
        System.out.println(sb);
        System.out.println(numChars);
        numChars = null;
    }
}
