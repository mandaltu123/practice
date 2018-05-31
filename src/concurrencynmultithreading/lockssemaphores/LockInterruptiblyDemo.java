package concurrencynmultithreading.lockssemaphores;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockInterruptiblyDemo {

    Lock lock = new ReentrantLock();

    public void doSomething() throws InterruptedException {
        try {
            lock.lockInterruptibly();
            // do some stuff here
        } finally {
            lock.unlock();
        }
    }
}
