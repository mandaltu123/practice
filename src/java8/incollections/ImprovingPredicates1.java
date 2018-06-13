package java8.incollections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImprovingPredicates1 {

    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");


        List<String> collect = friends.stream()
                .filter(startWith("N"))
                .collect(Collectors.toList());
        System.out.println(collect);
        List<String> collect1 = friends.stream()
                .filter(startWith("B"))
                .collect(Collectors.toList());
        System.out.println(collect1);
    }

    private static Predicate<? super String> startWith(String n) {
        return name -> name.startsWith(n);
    }
}
