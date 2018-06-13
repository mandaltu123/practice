package hackerrank.java;

import java.util.Scanner;

public class StringProblem1 {
    private static final String YES = "Yes";
    private static final String NO = "No";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String result = "";
        int totalLength = 0;
        // corner cases
        if (a == null || b == null) {
            System.out.println("Not a valid input");
            return;
        }

        if (a.compareTo(b) > 1) {
            result = YES;
        } else {
            result = NO;
        }

        totalLength = a.length() + b.length();
        System.out.println(totalLength + "\n" + result);
        if (result == YES) {
            System.out.println(makeCamelCase(b) + " " + makeCamelCase(a));
        } else {
            System.out.println(makeCamelCase(a) + " " + makeCamelCase(b));
        }
    }

    private static String makeCamelCase(String b) {
        String restult = "";
        restult = b.substring(0,1).toUpperCase().concat(b.substring(1, b.length()));
        return restult;
    }
}
