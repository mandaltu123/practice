package concurrencynmultithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    private static Semaphore mutex = new Semaphore(1);
    public static void test() {
        try {
            mutex.acquire();
            //do something here.....
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            mutex.release();
        }
    }
}
