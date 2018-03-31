package generics;

import java.util.Arrays;


/**
 * If we look at the code bellow we can understand that this is really a premitive functionality. We cant really
 * do much with the array as there are hardly any functionality available in array api.
 * In the next class we will check how Collections improves on this front.
 */
public class TheArrayProblem {

    public static void main(String[] args) {
        Person donDrapper = new Person("Don Draper", 89);
        Person peggyOlsen = new Person("Peggy Olsen", 65);

        Person[] people = {donDrapper, peggyOlsen};


        Person bertCouper = new Person("Bert Couper", 100);
        people = addMen(bertCouper, people);

        System.out.println(Arrays.toString(people));

    }

    private static Person[] addMen(Person person, Person[] people) {
        final int length = people.length;
        people = Arrays.copyOf(people, people.length + 1);
        people[length] = person;
        return people;
    }
}
