package java8.comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnotherPersonComparatorTest {

    public static void main(String[] args) {

        Comparator<Person> ageComparatorAsc = (person1, person2) -> person1.getAgeDifference(person2);
        Comparator<Person> ageComparatorDesc = ageComparatorAsc.reversed();

        List<Person> personList = Arrays.asList(new Person("Jenny", 25),
                new Person("Forest", 25),
                new Person("Bubba", 28),
                new Person("Lt. Dan", 35));

        List<Person> ascList = personList.stream()
                .sorted(ageComparatorAsc)
                .collect(Collectors.toList());

        List<Person> descList = personList.stream()
                .sorted(ageComparatorDesc)
                .collect(Collectors.toList());


        System.out.println("ASC: " + ascList.toString());
        System.out.println("DSC: " + descList.toString());
    }
}
