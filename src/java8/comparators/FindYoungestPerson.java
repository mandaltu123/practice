package java8.comparators;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindYoungestPerson {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Jenny", 24),
                new Person("Forest", 25),
                new Person("Bubba", 28),
                new Person("Lt. Dan", 35));

        Optional<Person> first = personList.stream()
                .sorted((person1, person2) -> person1.getAgeDifference(person2))
                .findFirst();

        System.out.println("Youngest person in the list here is : " + first.get());

        // There is another way of doing it

        personList.stream()
                .min(Person::getAgeDifference)
                .ifPresent(youngest -> System.out.println(youngest));

        // find the eldest in the list
        personList.stream()
                .max(Person::getAgeDifference)
                .ifPresent(eldest -> System.out.println(eldest));
    }

}
