package java8.somemoreoncollectors;

import java8.comparators.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetnameOrderByAge {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Jenny", 23),
                new Person("Forest", 25),
                new Person("Bubba", 28),
                new Person("Lt. Dan", 35));

        Map<Integer, List<String>> collect = personList.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));

        System.out.println("Group by age, get names = " + collect.toString());
    }
}
