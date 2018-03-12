package concurrencynmultithreading.synchronization;

import sun.tools.jconsole.Plotter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Counter {

    private int counter;


    synchronized public void increment() {
        counter++;
        System.out.println("Incrementing");
    }

    synchronized public void decrement() {
        counter--;
        System.out.println("Decrementing");
    }

    synchronized public int value() {
        return counter;
    }
}


class CounterTester {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        IncrementerThread incrementerThread = new IncrementerThread(counter);
        DecrementerThread decrementerThread = new DecrementerThread(counter);

        executorService.execute(incrementerThread);
        executorService.execute(decrementerThread);
        try {
            new Thread(incrementerThread).join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            new Thread(decrementerThread).join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // we will simulate some wait so that both the threads get executed and then we will try
        // to read the count which should be 0. We will do the right way later [making main thread wait till other
        // threads get terminated]

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The final count = " + counter.value());
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
