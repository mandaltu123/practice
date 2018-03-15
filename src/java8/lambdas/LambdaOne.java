package java8.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class LambdaOne {

    public static void main(String[] args) {

        Person jessica = new Person("Jessica", 24);


        Function<Person, Integer> f = person -> person.getAge();
        Function<Person, String> getname = person -> person.getName();
        // same lambda can be written in another way
        Function<Person, Integer> f1 = Person::getAge; // Both the functions are essentially the same
        System.out.format("%s is %s years old \n", getname.apply(jessica), f.apply(jessica));

        BinaryOperator<Integer> sum = (i1, i2) -> i1 + i2;
        BinaryOperator<Integer> sum1 = (i1, i2) -> Integer.sum(i1, i2);
        BinaryOperator<Integer> max = (a, b) -> Integer.max(a, b);

        System.out.println(max.apply(10, 19));
        System.out.println(sum.apply(124, 900));
        System.out.println(sum1.apply(12, 88));
    }
}
