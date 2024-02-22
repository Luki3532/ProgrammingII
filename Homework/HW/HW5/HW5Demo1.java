public class HW5Demo1 {
    public static void main(String[] args) {
        String firstWord = "Pocket";
        // String secondWord = "tekocp";
        String secondWord = "tekocd";

        String possibleIndexes = "";
        for (int i = 0; i < firstWord.length(); i++) {
            possibleIndexes += (i+" ");
        }
        System.out.println("possibleIndexes: "+possibleIndexes);
        //possible indexes populate based on length of first word 0,1,2,3..

        if (firstWord.length() == secondWord.length()) {
        // check for length
            for (int i = 0; i < firstWord.length(); i++) {
            // parse through first word
                for (int k = 0; k < possibleIndexes.length()-1; k++) {
                // check possible indexes
                /*
                 * the first item in the string delimited by a \\s
                 * so we are looking at the character in the second word at the index we find
                 */
                
                    if (firstWord.charAt(i) == secondWord.charAt(possibleIndexes.charAt(k))) {
                        System.out.println("TRUE!");
                    }
                    // if the chars are equal then great, delete the index we found the match in
                }
                
            }
        }
        //if length of words are equal then ALPHA1
    }
}
/*
ALPHA1
1
a b c

2
b a d 
check for length ? false{end}
1 (a) check 2 (a) true (remove index from list of possible indexes)
1 (b) check 2 (b) true (remove index from list of possible indexes)
1 (c) check 2 false{end}

*/

