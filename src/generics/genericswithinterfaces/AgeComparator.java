package generics.genericswithinterfaces;

import generics.Person;
import java8.lambdas.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person t1, Person t2) {
        return Integer.compare(t1.getAge(), t2.getAge());
    }
}
