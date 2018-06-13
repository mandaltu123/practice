package search;

public class PatternMatching {


    /**
     * String txt = "ABABDABACDABABCABAB";
     * String pat = "ABABCABAB";
     *
     * @param text
     * @param pattern
     * @return
     */
    public static boolean hasSubString(char[] text, char[] pattern) {
        // corner case
        if (text == null || pattern == null) {
            System.out.println("Not valid input");
            return false;
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < text.length && j < pattern.length) {
            if (text[i] == pattern[j]) {
                i++;
                j++;
            } else {
                j = 0;
                k++;
                i = k;
            }
        }
        if (j == pattern.length) {
            return true;
        }
        return false;
    }


    /**
     * Test method to test the find a particular substring is present in the given input string or not
     *
     * @param args
     */
    public static void main(String[] args) {

        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";

        boolean hasSubString = hasSubString(txt.toCharArray(), pat.toCharArray());
        System.out.println("does the pattern exist ? " + hasSubString);

    }
}
