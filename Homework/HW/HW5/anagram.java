/* Name: Lucas Carpenter
Class Name: C201
Date: 2/15/2024
General Description: This class is for checking for anagrams, 
method isAnagram does most of the heavy lifting while removeSingleChar 
is used for returning a string with the first occuring 
char of the formal perameter (char removeMe). 
This class has 3 error coverages,
the first is the presence of many of the same chars, 
which would confuse the program if not fixed
The Second is character ASCII descrimination,
no characters will be confused with their ASCII value counter part
The Third is any length errors, if they are not the same length 
they are not an anagram.
 */

public class anagram {

    public static boolean isAnagram(String word, String otherWord) {
    /*Dscription: this method returns true or false if two words are anagrams.
    The formal parameters include 2 String types. The return type of this 
    method is boolean.

    This Method Uses: removeSingleChar (a method of anagram
    to make the isAnagram method less convoluted)  */

        // remove illegal chars from word and word 2 e.g.(" ", |, !, *)
        word = word.replaceAll("\\s+|[^a-zA-Z]", "").toLowerCase();
        otherWord = otherWord.replaceAll("\\s+|[^a-zA-Z]", "").toLowerCase();


        // check to see if they are the same length, if they are not THEN return false
        if (word.length() != otherWord.length()) {
            return false;
        }


        // check if the first char of word is equal to any of the chars in word2
        for (int i = 0; i < word.length(); i++) { //parse through word
            for (int j = 0; j < otherWord.length(); j++) { //parse through otherWord
                if (    word.charAt(i) != otherWord.charAt(j)   ) {

                    /*when reaching the end of word2(when j == other word length) 
                    and all chars did not match THEN return FALSE   */
                    if (    j == otherWord.length() ) {
                        return false;
                    }
                    

                } else{
                    // Remove Single Char from otherWord that matched from word
                    otherWord = removeSingleChar(otherWord, word.charAt(i));
                }
            }
        }
        //if all chars are made of 1 pair then return true
        return true;
        
    }


    public static String removeSingleChar(String word, char removeMe) {
    // Description: This method removed a character(remove me) from a String(word)
    //  This method parses through word and adds each char to (String)temp 
    //  until it reaches (char)removeMe then it flips the switch(charRemoved)
    //  it does not add this char and then the for loop continues to add the chars
    //  until the for loop ends and the method returns (String)temp 

    // I made this method to make the isAnagram method less Confusing
        String temp = ""; // this variable temp(String) will be returned
        boolean charRemoved = false; //signal that char has been found and removed

        for (int i = 0; i < word.length(); i++) { //parse through word

            /*if word@index[i] == removeMe(char) AND char has not been removed yet */
            if (    (word.charAt(i) == removeMe) && (charRemoved == false)  ) {
                charRemoved = true; // switch charRemoved(boolean) TRUE
            } else{
                temp += word.charAt(i); //ADD word@index[i]
            }
        }
        return temp;
    }
}