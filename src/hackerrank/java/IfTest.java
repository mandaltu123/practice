package hackerrank.java;

import java.util.Scanner;

/**
 * If n is odd, print Weird
 * If n is even and in the inclusive range of 2 to 5, print Not Weird
 * If n is even and in the inclusive range of 6 to 20, print Weird
 * If n is even and greater than 20, print Not Weird
 */
public class IfTest {

    public static void main(String[] args) {
        System.out.println("Please provide input > [press -9 to exit] ");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
        {
            int input = scanner.nextInt();
            if(input == -9)
            {
                break;
            }
            if(input %2 != 0)
            {
                System.out.println("Weird");
            } else
            {
                // case when n is even
                if(input >=2  && input <= 5)
                {
                    System.out.println("Not Weird");
                } else if(input >= 5 && input <= 20 )
                {
                    System.out.println("Weird");
                } else if(input > 20)
                {
                    System.out.println("Not Weird");
                }
            }
        }
        scanner.close();
    }
}
