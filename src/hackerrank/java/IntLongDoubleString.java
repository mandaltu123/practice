package hackerrank.java;

import java.util.Scanner;

/**
 * There are three lines of input:
 *
 * The first line contains an integer.
 * The second line contains a double.
 * The third line contains a String.
 */
public class IntLongDoubleString {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        int intVal = scanner.nextInt();
        double doubleVal = scanner.nextDouble();
        scanner.nextLine();
        String stringVal = scanner.nextLine();
        System.out.println("Double: " + doubleVal);
        System.out.println("Int: " + intVal);
        System.out.println("stringVal: " + stringVal);
        scanner.close();
    }
    /**
     * This is how input output looks :
     * INPUT
     * ******************
     * 45
     * 34.60
     * This is my test
     * ******************
     * OUTPUT
     * ******************
     * Double: 34.6
     * Int: 45
     * stringVal: This is my test
     */
}
