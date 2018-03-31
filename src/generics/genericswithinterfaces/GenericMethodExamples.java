package generics.genericswithinterfaces;

import generics.Person;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodExamples {
    public static void main(String[] args) {
        Person donDrapper = new Person("Don Draper", 89);
        Person bertCooper = new Person("Bert Cooper", 100);
        Person peggyOlsen = new Person("Peggy Olsen", 65);

        List<Person> personList1 = new ArrayList<>();
        personList1.add(donDrapper);
        personList1.add(bertCooper);
        personList1.add(peggyOlsen);

        final Person youngestCast = min(personList1, new AgeComparator());
        System.out.println(youngestCast);
    }

    private static <T extends Person> T min(List<T> personList1, AgeComparator ageComparator) {
        if(personList1.isEmpty()) {
            throw new IllegalArgumentException("List is empty. Cannot find minimum");
        }
        T lowestElement = personList1.get(0);
        for (int i = 1; i < personList1.size(); i++) {
           final T element = personList1.get(i);
           if(ageComparator.compare(element, lowestElement) < 0) {
                lowestElement = element;
           }
        }
        return lowestElement;
    }
}
