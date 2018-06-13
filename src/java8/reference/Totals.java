package java8.reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Totals {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        System.out.println(totalValues(numbers, e -> true));
        System.out.println(totalValues(numbers, e -> e % 2 == 0));
    }

    private static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {

        return numbers.stream()
                .filter(selector)
                .reduce(0, Math::addExact);
    }
}
