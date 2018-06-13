package java8.incollections;

import java.util.function.Predicate;

public class AllPredicates {

    public static Predicate<String> getN() {
        return name -> name.startsWith("N");
    }
}
