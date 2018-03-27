package design.creational.composite;

import java.util.HashMap;
import java.util.Map;

public class CompositeTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("x", 100);
        map1.put("y", 200);
        map1.put("z", 300);
        map.putAll(map1);
    }
}
