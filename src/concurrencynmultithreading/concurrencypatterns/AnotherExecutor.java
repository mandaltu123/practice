package concurrencynmultithreading.concurrencypatterns;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AnotherExecutor {

    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();
        Runnable task1 = () -> {
            try {
                someReallyLongProcess();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable task2 = () -> {
            try {
                anotherReallyLongProcess();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        executor.execute(task1);
        executor.execute(task2);
        ((ExecutorService) executor).shutdown();

    }

    private static void anotherReallyLongProcess() throws InterruptedException {
        System.out.println(111);
        Thread.sleep(2000);
    }

    private static void someReallyLongProcess() throws InterruptedException {
        System.out.println(222);
        Thread.sleep(3000);
    }
}
