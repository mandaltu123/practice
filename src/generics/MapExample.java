package generics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Person donDrapper = new Person("Don Draper", 89);
        Person donDrapper1 = new Person("Don Draper", 89);
        Person peggyOlsen = new Person("Peggy Olsen", 65);
        Person bertCouper = new Person("Bert Couper", 100);


        Map<Person, String> personMap = new HashMap<>();
        personMap.put(donDrapper, donDrapper.getName());
        personMap.put(peggyOlsen, peggyOlsen.getName());
        personMap.put(bertCouper, bertCouper.getName());
        personMap.put(donDrapper1, donDrapper.getName());


        System.out.println(personMap);
    }

}
