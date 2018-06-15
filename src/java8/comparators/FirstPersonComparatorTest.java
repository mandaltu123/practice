package java8.comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FirstPersonComparatorTest {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Jenny", 25),
                new Person("Forest", 25),
                new Person("Bubba", 28),
                new Person("Lt. Dan", 35));

        List<Person> collect = personList.stream()
                .sorted((person1, person2) -> person1.getAgeDifference(person2))
                .collect(Collectors.toList());

        System.out.println("The sorted person list is : \n" + personList.toString());
        System.out.println("sorting in descending order -------------->");
        List<Person> collect1 = personList.stream()
                .sorted((person1, person2) -> person2.getAgeDifference(person1))
                .collect(Collectors.toList());

        System.out.println(collect1.toString());
    }
}
