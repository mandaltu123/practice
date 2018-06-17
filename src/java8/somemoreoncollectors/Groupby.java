package java8.somemoreoncollectors;


import java8.comparators.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groupby {

    public static void main(String[] args) {
        List<java8.comparators.Person> personList = Arrays.asList(new java8.comparators.Person("Jenny", 23),
                new java8.comparators.Person("Forest", 25),
                new java8.comparators.Person("Bubba", 28),
                new java8.comparators.Person("Lt. Dan", 35));

        Map<Integer, List<Person>> collect = personList.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        System.out.println("list after grouping by = " + collect.toString());
    }
}
