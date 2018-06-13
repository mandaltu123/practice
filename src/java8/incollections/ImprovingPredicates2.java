package java8.incollections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ImprovingPredicates2 {

    public static void main(String[] args) {
        final Function<String, Predicate<String>> startsWithLetter =
                (String letter) ->
                {
                  Predicate<String> checkStartsWith =
                          (String name) -> name.startsWith(letter);
                  return checkStartsWith;
                };

        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        final long startingWithNCount = friends.stream()
                .filter(startsWithLetter.apply("N"))
                .count();
        System.out.println(startingWithNCount);
    }
}
