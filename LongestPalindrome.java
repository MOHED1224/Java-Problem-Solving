
public class LongestPalindrome {

    // This code is used to get the longest palindrome in a string which is the longest series of letters appears at the both ends of the word.
    // e.g: "maximhfgmixam", longest palindrome here is "maxim".

    public static void main(String[] args) {

        String s1 = "maximhfgmixam";
        StringBuilder sb = new StringBuilder();
        int middle = ((s1.length()%2==0) ? (s1.length()/2) : (s1.length()/2)+1); //get the index of the middle element
        boolean checker = true;
        for (int i=s1.length()-1, j=0 ; i>=middle ; i--, j++){ // Loop with 2 pointers. i starts from the beginning of word to the middle of the word. j starts at the end going back to the middle of the word
            char c1 = s1.charAt(i);
            char c2 = s1.charAt(j);

            // Check that the letter at the same index from opposite side [ index(1) from begging & index[2] from the end ] are equal.
            if(c1 == c2){
                sb.append(c1);
            }
            else{ // else means that the palindrome has come to the end so we print it and exit the for loop
                System.out.println( "Longest palindrome: '" + sb.toString() + "'");
                checker = false;
                break;
            }
        }

        // If checker is true so the word is a mirror word.
        if(checker == true){
            System.out.println( "Longest palindrome: '" + sb.toString() + "'");
        }
    }
}
