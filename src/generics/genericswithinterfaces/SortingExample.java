package generics.genericswithinterfaces;

import generics.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {

    public static void main(String[] args) {
        Person donDrapper = new Person("Don Draper", 89);
        Person bertCooper = new Person("Bert Cooper", 100);
        Person peggyOlsen = new Person("Peggy Olsen", 65);

        List<Person> personList = new ArrayList<>();
        personList.add(donDrapper);
        personList.add(bertCooper);
        personList.add(peggyOlsen);

        AgeComparator ageComparator = new AgeComparator();
        AgeComparatorDescending descending = new AgeComparatorDescending();

        Collections.sort(personList, ageComparator);
        System.out.println(personList);
        Collections.sort(personList, descending);
        System.out.println(personList);

        System.out.println("generic reverse comparator===============>");

        List<Person> personList1 = new ArrayList<>();
        personList1.add(donDrapper);
        personList1.add(bertCooper);
        personList1.add(peggyOlsen);
        Collections.sort(personList1, new ReverseComparator<>(new AgeComparator()));
        System.out.println(personList1);


    }
}
