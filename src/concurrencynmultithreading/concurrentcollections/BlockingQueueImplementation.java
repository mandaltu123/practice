package concurrencynmultithreading.concurrentcollections;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueueImplementation {

    private List<Integer> queue = new LinkedList<>();
    private int limit = 10;

    public BlockingQueueImplementation(int limit) {
        this.limit = limit;
    }

    public synchronized void enqueue(int item) throws InterruptedException {
        while (this.queue.size() == this.limit) {
            wait();
        }
        if (this.queue.size() == 0) {
            notifyAll();
        }
        this.queue.add(item);
    }

    public synchronized int dequeue() throws InterruptedException {
        while (this.queue.size() == 0) {
            wait();
        }
        if (this.queue.size() == this.limit) {
            notifyAll();
        }
        return this.queue.remove(0);
    }
}
