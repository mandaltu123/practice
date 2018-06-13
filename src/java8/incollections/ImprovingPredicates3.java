package java8.incollections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImprovingPredicates3 {

    private static Function<String, Predicate<String>> startsWith = letter -> name -> name.startsWith(letter);
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        List<String> collect = friends.stream()
                .filter(startsWith.apply("S"))
                .collect(Collectors.toList());

        System.out.println(collect.toString());

    }
}
