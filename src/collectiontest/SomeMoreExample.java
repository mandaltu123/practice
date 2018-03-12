package collectiontest;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SomeMoreExample {


    public static void main(String[] args) {

        Collection<Snow> collection = Arrays.asList(new Snow(), new Powder(), new Light());
        System.out.println(collection.size());
        /**
         * The bellow code wont compile
         */
        List<Snow> snow2 = Arrays.asList(new Slush(), new Light(), new Heavy());
        snow2.forEach(snow -> System.out.println(snow.getClass()));

    }
}

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Slush extends Snow {}
