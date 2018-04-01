package generics.unboundedusage;

import java.util.ArrayList;
import java.util.List;

public class UnboundedTest {

    public static void main(String[] args) {
        List<?> objects = new ArrayList<>();
        objects.add(null);
        System.out.println(objects);
    }
}
