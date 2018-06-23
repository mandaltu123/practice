package strings;

public class StringEquality {

    private static final String s1 = "hey there";
    private static final String s2 = new String("hey there");

    public static void main(String[] args) {
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}


class StringReversal {
    private static final String s1 = "heytheredelailah";

    public static void main(String[] args) {
        StringBuilder resultString = new StringBuilder();
        char[] chars = s1.toCharArray();
        for (int i = chars.length-1; i>=0; i--) {
            resultString.append(chars[i]);
        }
        System.out.println(resultString.toString());
    }
}