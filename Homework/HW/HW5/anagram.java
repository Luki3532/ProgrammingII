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
    public static void main(String[] args) {
        System.out.println("listen and silent: " +          //Set 1: Comparing Regular 
                                                            // expressions
            isAnagram("listen", "silent"));

        System.out.println("elbow and below: " + 
            isAnagram("elbow", "below"));

        System.out.println("Dormitory and Dirty Room: " +   //Set 2: Comparing 
                                                            // expressions with spaces
            isAnagram("Dormitory", "Dirty Room"));

        System.out.println("funeral and real fun: " + 
            isAnagram("funeral", "real fun"));

        System.out.println("a gentleman and elegant man: " + 
            isAnagram("a gentleman", "elegant man"));

        System.out.println("look and lock: " +             //Set 3: Comparing 
                                                           // expression with duplicates
            isAnagram("look", "lock"));

        System.out.println(" and : " +                     //Set 4: Comparing 
                                                           // empty strings    
            isAnagram("", ""));

        System.out.println("NulL| and 1nUll: " +           //Set 5: 
                                                           // Compare illigal chars
            isAnagram("NulL|", "1nUll"));

        System.out.println("null and : " + 
            isAnagram("null", ""));

        System.out.println("abc and abcd: " +              //Set 6: Comparing 
                                                           // duplicates *AGAIN* these 
                                                           // really messed the 
                                                           // program up
            isAnagram("abc", "abcd"));

        System.out.println("abcd and abd: " + 
            isAnagram("abcd", "abd"));

        System.out.println("abdb and abDD: " +              
            isAnagram("abdb", "abDD"));
    }

    public static boolean isAnagram(String word, String otherWord) {
    /*Dscription: this method returns true or false if two words are anagrams.
    The formal parameters include 2 String types. The return type of this 
    method is boolean.

    This Method Uses: removeSingleChar (a method of anagram
    to make the isAnagram method less convoluted)  */

        word = 
        word.replaceAll("\\s+|[^a-zA-Z]", "").toLowerCase();
                                                            // Remove illigal chars and 
                                                            // change string to 
                                                            // all lowercase
        otherWord = 
        otherWord.replaceAll("\\s+|[^a-zA-Z]", "").toLowerCase();
                                                            
    
        if (word.length() != otherWord.length()) {          // words must match in 
                                                            // length if they dont 
                                                            // then return false
            return false;
        }
    
        for (int i = 0; i < word.length(); i++) {           // parse though word
            char c = word.charAt(i);                        // where c(char) is 
                                                            // characters from word

            int index = otherWord.indexOf(c);               // index is the index of 
                                                            // the first occurance of 
                                                            // the earliest character 
                                                            // in otherWord
    
            if (index == -1) {                              // if indexOf returns -1 
                                                            // then the character does 
                                                            // not exist in the otherWord
                return false;
            } else {
                otherWord = removeSingleChar(otherWord, c); // if the character exists in 
                                                            // otherWord then remove that 
                                                            // character and re run the 
                                                            // loop with the returned string
            }
        }
    
        if (otherWord.length() == 0) {                      // if otherWord is empty the 
                                                            // words/phrases are anagrams, 
                                                            // otherwise the error would have 
                                                            // been caught so print the 
                                                            // appropriate return statement
            return true;
        } else{
            return false;
        }
    }
    

    public static String removeSingleChar(String word, char removeMe) {
    // Description: This method removed a character(remove me) from a String(word)
    //  This method parses through word and adds each char to (String)temp 
    //  until it reaches (char)removeMe then it flips the switch(charRemoved)
    //  it does not add this char and then the for loop continues to add the chars
    //  until the for loop ends and the method returns (String)temp 

    // I made this method to make the isAnagram method less Confusing

        String temp = "";                                   // this variable temp(String) 
                                                            // will be returned

        boolean charRemoved = false;                        //create a switch so that when 
                                                            // the char to be removed is 
                                                            // found it does not 
                                                            // continually remove chars 
                                                            // of contents removeMe
       

        for (int i = 0; i < word.length(); i++) {           //parse through word

            if (    (word.charAt(i) == removeMe) && (charRemoved == false) ) {
                                                            // if removeMe(char) is found 
                                                            // and it has not been found 
                                                            // before then tell the boolean 
                                                            // that the char has been 
                                                            // found/removed
                charRemoved = true;
            } else{
                temp += word.charAt(i);                     // in every other case add 
                                                            // the char to temp
            }
        }
        return temp;                                        // finally return temp

    }
}