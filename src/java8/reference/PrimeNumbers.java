package java8.reference;

import java.util.stream.IntStream;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(5));
    }

    private static boolean isPrime(int number) {
        //java 7 style [IMPERATIVE STYLE]
        /*for (int j = 2; j<number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;*/
        // we can modify that with java 8 style [DECLARATIVE STYLE]
        return number > 1 && IntStream.range(2, number)
                .noneMatch(index -> number % index == 0);
    }

}
