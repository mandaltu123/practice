package java8.incollections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ConciseCodeWithLambda {


    public static void pickName(List<String> names, String letter) {
        Optional<String> first = names.stream()
                .filter(name -> name.startsWith(letter))
                .findFirst();

        System.out.println(String.format("A name string with %s: %s", letter, first.orElse("No name found")));
    }

    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        pickName(friends, "x");
        pickName(friends, "S");
    }


}
