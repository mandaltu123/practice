package hackerrank.java.medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiagonalDifference2DArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] aRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int aItem = Integer.parseInt(aRowItems[j]);
                a[i][j] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    static int diagonalDifference(int[][] a) {
        int diff = 0;
        int primary_diagonal_sum = 0;
        int secondary_diagonal_sum = 0;
        for (int i = 0; i<a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i == j) {
                    primary_diagonal_sum += a[i][j];
                }
                if(i == a.length -j -1) {
                    secondary_diagonal_sum += a[i][j];
                }
            }
        }

        diff = primary_diagonal_sum - secondary_diagonal_sum;
        return Math.abs(diff);

    }

}
