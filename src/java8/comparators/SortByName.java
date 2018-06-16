package java8.comparators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortByName {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Jenny", 25),
                new Person("Forest", 25),
                new Person("Bubba", 28),
                new Person("Lt. Dan", 35));

        List<Person> sortedListByName = personList.stream()
                .sorted((person1, person2) -> person1.getName().compareTo(person2.getName()))
                .collect(Collectors.toList());

        System.out.println("sorted by name = " + sortedListByName.toString());
    }
}
