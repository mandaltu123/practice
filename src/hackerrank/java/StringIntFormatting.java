package hackerrank.java;

import java.util.Scanner;

/**
 * Sample Input
 * ****************
 * java 100
 * cpp 65
 * python 50
 * ****************
 * Sample Output
 * ****************
 * ================================
 * java           100
 * cpp            065
 * python         050
 * ================================
 *
 * In each line of output there should be two columns:
 * The first column contains the String and is left justified using exactly  characters.
 * The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three
 * digits, you must pad your output's leading digits with zeroes.
 *
 */
public class StringIntFormatting {

    public static final String SPACE = " ";
    public static final String ZERO = "0";

    public static void main(String[] args) {
        StringBuilder first = new StringBuilder();
        StringBuilder last = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            first.append(scanner.next());
            last.append(String.valueOf(scanner.nextInt()));
            int firstLength = first.length();
            int lastLength = last.length();
            int y = 3 - lastLength;
            if (last.length() < 3)
            {
                while ( y > 0)
                {
                    last.insert(0, ZERO);
                    y--;
                }
            }
            int x = 15 - firstLength;
            while ( x > 0)
            {
                first.append(SPACE);
                x--;
            }
            System.out.println(first.toString() + last.toString());
            first = new StringBuilder();
            last = new StringBuilder();
        }

        System.out.println("================================");
        scanner.close();
    }

}
