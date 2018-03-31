package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * If we look at the code as compared to TheArrayProblem, we can see that the arraylist takes away some of those
 * array re sizing problems and gives us more flexibility as compared to arrays
 */
public class ListExample {

    public static void main(String[] args) {
        Person donDrapper = new Person("Don Draper", 89);
        Person peggyOlsen = new Person("Peggy Olsen", 65);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDrapper);
        madMen.add(peggyOlsen);

        System.out.println(madMen);
        Person bertCouper = new Person("Bert Couper", 100);
        madMen.add(bertCouper);
        System.out.println(madMen);
        System.out.println(madMen.get(0));

        System.out.println(madMen.size());

        madMen.forEach(System.out::print);

    }

}
