package concurrencynmultithreading.lockssemaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PersonDemo {

    static private Object key = new Object();
    static int x = 10;

    // One way of making a synchronized block is create an object and pass it on to the synchronization unit

    /**
     * Problem with synchronized blocks are , if by some means , thread goes in wait state inside the synchronized block
     * there is no way to recover from this state. The execution will not come out of synchronized block and other threads
     * will always be waiting.
     * Only way to recover from this is to reboot the jvm.
     * @return
     */
    public static String init() {

        synchronized (key) {
            System.out.println("Thread which is accessing the synchronized block now is : " + Thread.currentThread().getName());
            x += 1;
        }
        return "some result: " + x;
    }


    public static void main(String[] args) throws InterruptedException {

        Runnable task1 = () -> System.out.println(init());
        Runnable task2 = () -> System.out.println(init());
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.shutdown();
        executorService.awaitTermination(100, TimeUnit.MILLISECONDS);
    }
}
