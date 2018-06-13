package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NothingtodowithJava8 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 4, 5);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9));

        boolean b = list2.removeAll(list1);
        System.out.println("data removed " + b + " and list after removing elements = " + list2.toString());
    }
}
