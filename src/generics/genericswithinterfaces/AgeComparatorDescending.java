package generics.genericswithinterfaces;

import generics.Person;
import java8.lambdas.Comparator;

public class AgeComparatorDescending implements Comparator<Person> {

    @Override
    public int compare(Person t1, Person t2) {
        return -1 * Integer.compare(t1.getAge(), t2.getAge());
    }
}
