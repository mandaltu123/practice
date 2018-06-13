package java8.incollections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImprovingPredicates {

    public static void main(String[] args) {

        final Predicate<String> startsWithN = name -> name.startsWith("N");
        final Predicate<String> startWithB = name -> name.startsWith("B");

        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        List<String> collect = friends.stream()
                .filter(startsWithN)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(collect.toString());

        long countOfFriends = friends.stream()
                .filter(startWithB)
                .count();
        System.out.println("countOfFriends = " + countOfFriends);

        // This is all good, but the two predicates are same except just one alphabet. So this is not really generic.
        // in the next example we will see how can we remove this duplication.
    }
}
