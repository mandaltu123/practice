package concurrencynmultithreading.concurrencypatterns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * How can we improve onb creating new Threads each time.
 *
 *By using a thread pool, ready to use threads and using them.
 * Instead of creating a thread with a task as a parameter, we pass
 * a task to a pool of threads, that will execute it.
 *
 * So we need two patterns
 * 1. create a pool of threads
 * 2. pass a task to this pool to execute
 */
public class ExecutorPattern {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService singeThreadExecutor = Executors.newSingleThreadExecutor();
        // This thread pool will be alive as long as the thread pool is alive.
        // in order to shut it down, there is a shutdown() method that we need to invoke

        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);

        Runnable task = () -> System.out.println("I run");
        singeThreadExecutor.execute(task);
        Thread.sleep(900);
        singeThreadExecutor.shutdown();
    }
}
