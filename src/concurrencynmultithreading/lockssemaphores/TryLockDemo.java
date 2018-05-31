package concurrencynmultithreading.lockssemaphores;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockDemo {


    Lock lock = new ReentrantLock();

    /**
     * This is a timed lock acquisition
     * If a thread is already accessing the guarded block of code, then tryLock() returns
     * false immediately
     *
     */
    public void doSomething() {
        if (lock.tryLock()) {
            try
            {
                // guarded block of code
            } finally {
                lock.unlock();
            }
        } else {
            // do some other stuff here
        }

    }
}
