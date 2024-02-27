/**
 * HW5
 */
public class HW5 {

    public static void main(String[] args) {
        System.out.println(checkAnagram("listen", "silent"));
        System.out.println(checkAnagram("elbow", "below"));
        System.out.println(checkAnagram("Dormitory", "Dirty Room"));
        System.out.println(checkAnagram("funeral", "real fun"));
        System.out.println(checkAnagram("a gentleman", "elegant man"));
        System.out.println(checkAnagram("look", "lock"));
        System.out.println(checkAnagram("", ""));

        // Check for case sensitivity
        System.out.println(checkAnagram("NulL|", "1nUll"));

        System.out.println(checkAnagram("null", ""));
        System.out.println(checkAnagram("abc", "abcd"));
        System.out.println(checkAnagram("abcd", "abd"));
        System.out.println(checkAnagram("abbb", "abDD"));
    }
    public static boolean checkAnagram(String word, String otherWord) {

        word = word.replaceAll("\\s+|[^a-zA-Z]", "").toLowerCase();
        otherWord = otherWord.replaceAll("\\s+|[^a-zA-Z]", "").toLowerCase();

        int temp = 0;

        if (word.length() != otherWord.length()) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            temp = 0;
            for (int j = 0; j < otherWord.length(); j++) {
                if (word.charAt(i) != otherWord.charAt(j)) {
                    temp+=1;
                    if (temp == otherWord.length()) {
                        return false;
                    }
                }
            }
        }
        return true;
        
    }
}