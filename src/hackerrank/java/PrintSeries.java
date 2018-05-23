package hackerrank.java;

import java.util.Scanner;

/**
 * Sample Input:
 * *********************
 * 2
 * 0 2 10
 * 5 3 5
 *
 * Sample output:
 * *********************
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98
 */
public class PrintSeries {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < t; i++)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int result = 0;
            for (int j = 0; j< n; j++)
            {
                if(j != 0)
                {
                    result += Math.pow(2, j)*b;
                } else
                {
                    result += a + Math.pow(2, j)*b;
                }
                resultString.append(result).append(" ");
            };
            System.out.println(resultString);
            resultString = new StringBuilder();
        }
        scanner.close();
    }
}
