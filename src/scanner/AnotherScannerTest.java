package scanner;

import java.util.Scanner;

public class AnotherScannerTest {

    public static void main(String[] args) {
        System.out.println("Please provide an input > ");
        Scanner scanner = new Scanner(System.in);

        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();
        System.out.println("myString = " + myString);
        System.out.println("myInt = " + myInt);
    }
}
