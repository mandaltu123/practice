package java8.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LambdaIntroduction {

    private static final Comparator<String> comparatorOld = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }
    };


    /**
     * In this example we will first demonstrate how we used to write code in earlier versions of java.
     * Later we will learn how to use these code passed to another function and method parameters or lambda
     * expressions.
     * @param args
     */

    public static void main(String[] args) {

        String[] strings = new String[]{"one", "two", "three", "four"};
        Arrays.sort(strings, comparatorOld);
        System.out.println(Arrays.toString(strings));

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        };

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(runnable);

        // CHANGE THE COMPARATOR AND RE WRITE IT WITH LAMBDA
        Comparator<String> comparator =
                (s1, s2) -> Integer.compare(s1.length(), s2.length());
        String[] strings1 = new String[]{"five", "two", "three", "four", "hundred"};
        Arrays.sort(strings1, comparator);
        System.out.println(Arrays.toString(strings1));

        //CHANGE THE RUNNABLE AND MAKE IT A LAMBDA

        Runnable r = () -> {
            int i = 0;
            while(i < 10) {
                System.out.println("it works!");
                i++;
            }
        };
        service.execute(r);
        service.shutdown();
    }
}
