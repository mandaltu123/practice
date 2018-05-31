package concurrencynmultithreading.concurrencypatterns;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestOne {


    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> System.out.println("whatever task");
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(task);
        ((ExecutorService) executor).shutdown();
        ((ExecutorService) executor).awaitTermination(30000, TimeUnit.MILLISECONDS);
    }
}
