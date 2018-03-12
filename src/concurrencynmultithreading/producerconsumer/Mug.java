package concurrencynmultithreading.producerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Mug {

    private int content;
    private boolean available = false;


    public synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notifyAll();
        return content;
    }


    public synchronized void put(int data) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = true;
        content = data;
        notifyAll();
    }
}

class ProducerConsumerTest {
    public static void main(String[] args) {
        Mug mug = new Mug();
        Producer producer = new Producer(mug);
        Consumer consumer = new Consumer(mug);
        ExecutorService executorService = Executors.newFixedThreadPool(2); // IF I assign 1 thread
        // producer consumer will not work. Because one thread will go in wait state but there is not other
        // thread to execute another one get /put

        executorService.execute(producer);
        executorService.execute(consumer);
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
