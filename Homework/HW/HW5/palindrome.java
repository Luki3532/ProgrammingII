/*
Lab Assignment 3
2/13/2024
Lucas Carpenter
Genneral Description: This class is for checking to see if a string is a palindrome
there is 1 method in this class(isPalindrome).
*/

public class palindrome {

    public static boolean isPalindrome(String word) {
        // take the first letter and the last letter then compare,
        // then move to the 2nd letter and the 1st to last letter and so on.
        // palindrome is false when any characters being compared are not equal

        //format word, remove all things that are not a:z and A:Z
        word = word.replaceAll("\\s+|[^a-zA-Z]", "").toLowerCase();

        for (int i = 0; i < word.length(); i++) { //parse word

            //if word@index[i] is not equal to the char at the end at the end 
            // length of the word minus the number of itterations there has been
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false; // ? FALSE: then return FALSE
            }
        }

        // if all the chars have pairs then return TRUE
        return true;
    }
}