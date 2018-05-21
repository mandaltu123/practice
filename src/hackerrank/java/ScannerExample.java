package hackerrank.java;

import java.util.Scanner;

/**
 * In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on
 * a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.
 */
public class ScannerExample {

    public static void main(String[] args) {
        System.out.println("Please provide 3 integers from stdin > ");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 3)
        {
            int input = scanner.nextInt();
            System.out.println(input);
            count++;
        }
    }
}
