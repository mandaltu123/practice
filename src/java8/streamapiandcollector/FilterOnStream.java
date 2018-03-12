package java8.streamapiandcollector;

import java.util.List;
import java.util.stream.Stream;

public class FilterOnStream {

    public static void main(String[] args) {

        List<Person> people = StreamsIntroduction.getPeople();
        Stream<Person> stream = people.stream();
        //The bellow list will contain person who has age greater than 20
        Stream<Person> filtered = stream.filter(PersonPredicate.isAgeGreaterThan20());
        filtered.forEach(System.out::println);
    }
}
