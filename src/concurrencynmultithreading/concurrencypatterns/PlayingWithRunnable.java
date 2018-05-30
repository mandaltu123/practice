package concurrencynmultithreading.concurrencypatterns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PlayingWithRunnable {

    public static void main(String[] args) {
        Runnable task = () -> System.out.println("I am in thread: " + Thread.currentThread().getName());
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 10; i++)
        {
            executorService.execute(task);
        }
        executorService.shutdown();
        /**
         * output looks like this: with Executors.newFixedThreadPool(10)
         *
         * I am in thread: pool-1-thread-1
         * I am in thread: pool-1-thread-3
         * I am in thread: pool-1-thread-2
         * I am in thread: pool-1-thread-4
         * I am in thread: pool-1-thread-5
         * I am in thread: pool-1-thread-6
         * I am in thread: pool-1-thread-7
         * I am in thread: pool-1-thread-8
         * I am in thread: pool-1-thread-9
         * I am in thread: pool-1-thread-10
         *
         *
         * output with Executors.newFixedThreadPool(4)
         *
         * I am in thread: pool-1-thread-1
         * I am in thread: pool-1-thread-4
         * I am in thread: pool-1-thread-3
         * I am in thread: pool-1-thread-2
         * I am in thread: pool-1-thread-3
         * I am in thread: pool-1-thread-4
         * I am in thread: pool-1-thread-1
         * I am in thread: pool-1-thread-4
         * I am in thread: pool-1-thread-3
         * I am in thread: pool-1-thread-2
         */
    }
}
