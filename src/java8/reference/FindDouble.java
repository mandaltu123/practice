package java8.reference;

import java.util.Arrays;
import java.util.List;

/**
 * Find the double value of first even number greater than 3
 */
public class FindDouble {

    private static boolean isGreaterThan3(int number) {
        System.out.println("isGreaterThan3 => " + number);
        return number > 3;
    }

    private static boolean isEven(int number) {
        System.out.println("isEven = > " + number);
        return number % 2 == 0;
    }

    private static int doubleIt(int number) {
        System.out.println("doubleIt = > " + number);
        return number * 2;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8);

        // lazy and composition
        System.out.println(
                numbers.stream()
                        .filter(FindDouble::isGreaterThan3)
                        .filter(FindDouble::isEven)
                        .map(FindDouble::doubleIt)
                        .findFirst() // the methods get called only when findFirst is called.This is lazy
                        .get()
        );
    }
}
