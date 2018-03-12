package java8.streamapiandcollector;

import java.util.function.Predicate;


/**
 * Idea is to crate a class of predicates that will be used on list of person stream operations
 */
public class PersonPredicate {

    /**
     * Returns predicate where age greater than 20
     * @return
     */
    public static Predicate<Person> isAgeGreaterThan20() {
        return person -> person.getAge() > 20;
    }
}
