package java8.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * In this class we will see how lambdas + static methods + default methods work
 */
public class CreatingNewApiWithLambdas {


    private static final Comparator<Person>  ageComparator = (p1, p2) -> p1.getAge() - p2.getAge();
    private static final Comparator<Person> nameComparator = (p1, p2) -> p1.getName().compareTo(p2.getName());


    public static void main(String[] args) {

        Person rob = new Person("Rob", 30);
        Person angus = new Person("Angus", 60);

        List<Person> personList = new ArrayList<>();
        personList.add(rob);
        personList.add(angus);
        Collections.sort(personList, ageComparator);
        System.out.println(personList);

        Collections.sort(personList, nameComparator);
        System.out.println(personList);


        // ANOTHER WAY OF WRITING IT
        Function<Person, Integer> f1 = person -> person.getAge();
        Function<Person, String> f2 = person -> person.getName();

        java8.lambdas.Comparator<Person> cmpPersonAge = java8.lambdas.Comparator.comparing(Person::getAge);
        java8.lambdas.Comparator<Person> cmpPersonName = java8.lambdas.Comparator.comparing(Person::getName);

        Collections.sort(personList, cmpPersonAge);
        System.out.println(personList);
        Collections.sort(personList, cmpPersonName);
        System.out.println(personList);


    }
}
