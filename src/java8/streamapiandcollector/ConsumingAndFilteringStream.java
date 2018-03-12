package java8.streamapiandcollector;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsumingAndFilteringStream {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");
        Stream<String> stream1 = Stream.of("one", "two", "three", "four", "five");
        Stream<String> stream2 = Stream.of("one", "two", "three", "four", "five");
        stream.forEach(System.out::println);
        Predicate<String> p1 = s -> s.length() > 3;
        Stream<String> stringStream = stream1.filter(p1);
        System.out.println("========");
        stringStream.forEach(System.out::println);
        System.out.println("========");
        Predicate<String> equalTwo = Predicate.isEqual("two");
        Predicate<String> equalThree = Predicate.isEqual("three");
        Stream<String> stream3 = stream2.filter(equalTwo.or(equalThree));
        stream3.forEach(System.out::println);


        List<Person> people = StreamsIntroduction.getPeople();
        List<Person> result = new ArrayList<>();
        Stream<Person> personStream = people.stream()
                .filter(person -> person.getAge() > 20)
                .peek(result::add);
        personStream.forEach(System.out::println);


        List<String> collect = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        System.out.println("Final data ========>");
        collect.stream().forEach(System.out::println);

    }
}

