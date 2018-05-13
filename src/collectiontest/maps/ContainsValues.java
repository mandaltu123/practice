package collectiontest.maps;

import java.util.HashMap;
import java.util.Map;

public class ContainsValues extends Demo implements DemoInterface {


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("anotherone", 1);
        map.put("tow", 2);
        map.put("three", 3);
        map.put("four", 4);
        getKeys(map, 1);

        ContainsValues values = new ContainsValues();
        values.test();
    }


    public static void getKeys(Map map, Integer value) {
        boolean val = map.containsValue(value);
        System.out.println(val);
    }

    @Override
    public void test() {
        System.out.println("I am overridden");
    }
}

abstract class Demo
{
    public Demo()
    {
        // abstract class can have a constructor
    }

    public abstract void test();
}


interface DemoInterface
{
    public abstract void test();
}