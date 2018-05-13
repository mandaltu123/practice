package java8.lambdas;

import java.util.Arrays;

public class ArraySort {


    public static void main(String[] args) {
        String[] words = {"every" , "duck" , "does", "quack"};
        Arrays.sort(words, (x, y) -> {return(x.length() - y.length());});
        System.out.println(Arrays.toString(words));
    }
}
