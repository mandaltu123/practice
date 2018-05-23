package hackerrank.java;

import java.util.Scanner;

/**
 * Write a program to print multiplication data like this :
 *
 * Input:
 * 5
 * ************************
 * Output
 * ************************
 * 5 x 1 = 5
 * 5 x 2 = 10
 * 5 x 3 = 15
 * 5 x 4 = 20
 * 5 x 5 = 25
 * 5 x 6 = 30
 * 5 x 7 = 35
 * 5 x 8 = 40
 * 5 x 9 = 45
 * 5 x 10 = 50
 */
public class MulitplicationTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number >= 2 && number <= 20)
        {
            for (int i = 1; i < 11; i++)
            {
                System.out.println(number + " x " + i + " = " + number*i);
            }
        }

        scanner.close();
    }
}
