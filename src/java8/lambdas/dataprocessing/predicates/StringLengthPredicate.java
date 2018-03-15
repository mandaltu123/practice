package java8.lambdas.dataprocessing.predicates;

import java.util.function.Predicate;

public class StringLengthPredicate {


    /**
     * Old way of writing a predicate [Java 7 way]
     */
    Predicate<String> lengthLessThan20 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() < 20;
        }
    };


    /**
     * Java 8 way of implementing Predicate
     */
    Predicate<String> lengthLessThan20New = s -> s.length() < 20;

}
