package java8.somemoreoncollectors;

import java8.comparators.Person;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class OldestPerson {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Jenny", 24),
                new Person("Forest", 25),
                new Person("Bubba", 28),
                new Person("Bodhi", 29),
                new Person("Lt. Dan", 35));

        Comparator<Person> byAge = Comparator.comparing(Person::getAge);
        Map<Character, Optional<Person>> collect = personList.stream()
                .collect(Collectors.groupingBy(person -> person.getName().charAt(0)
                        , Collectors.reducing(BinaryOperator.maxBy(byAge))));

        System.out.println(collect.get('B').get());

    }
}
