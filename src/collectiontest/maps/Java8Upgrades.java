package collectiontest.maps;

import java.util.*;

public class Java8Upgrades {

    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("key"+i, "value"+i);
        }
        map.forEach((k, v)-> System.out.println(v));
    }
}
