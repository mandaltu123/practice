package java8.streamapiandcollector;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOperation {

    public static void main(String[] args) {

        List<Person> people = StreamsIntroduction.getPeople();
        Stream<Person> stream = people.stream();
        List<String> collect =
                stream.filter(PersonPredicate.isAgeGreaterThan20())
                .map(person -> person.getName().toUpperCase())
                        .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
