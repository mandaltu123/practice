package scanner;

import java.util.Scanner;

/**
 * A simple example of how to use scanner
 */
public class ScannerTest {

    public static void main(String[] args) {
        // declare an object and initialize with predefined standard input object
        System.out.println("Please provide an integer number [press -9 to stop providing input]> \n");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        // check if an int value is available
        while (scanner.hasNext()) {
            // read an int value
            int input = scanner.nextInt();
            if(input == -9)
            {
                break;
            }
            sum += input;
            count++;
        }
        // do the average here
        double mean = sum / count;
        System.out.println("The mean is " + mean);

    }

}
