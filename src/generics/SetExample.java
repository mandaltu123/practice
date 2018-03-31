package generics;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Person donDrapper = new Person("Don Draper", 89);
        Person peggyOlsen = new Person("Peggy Olsen", 65);
        Person bertCouper = new Person("Bert Couper", 100);


        Set<Person> personSet = new HashSet<>();
        personSet.add(donDrapper);
        personSet.add(peggyOlsen);
        personSet.add(bertCouper);
        personSet.add(bertCouper);

        System.out.println(personSet);

        personSet.forEach(System.out::print);
    }
}
