package java8.reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FirstUsageOfPredicates {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7);
        Predicate<Integer> isGT3 = e -> e > 3;
        Predicate<Integer> isEven = e -> e % 2 == 0;
        System.out.println(
                numbers.stream()
                        .filter(isGT3)
                        .filter(isEven)
                        .map(e -> e * 2)
                        .findFirst()
                        .get()
        );
    }
}
