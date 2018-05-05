package concurrencynmultithreading.producerconsumer;

/**
 * Odd even printer class has got 2 methods
 *
 * One method prints odd numbers from 0-10 other prints even numbers.
 */
public class OddEven {

    public synchronized void oddPrinter() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            if(i % 2 != 0) {
                System.out.println("fromOdd->" + i);
                notifyAll();
            } else {
                wait();
            }
        }
    }

    public synchronized void evenPrinter() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.println("fromEven-> " + i);
                notifyAll();
            } else {
                wait();
            }
        }
    }
}
