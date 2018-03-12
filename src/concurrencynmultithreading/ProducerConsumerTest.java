package concurrencynmultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class MyCup {

    private int content;
    private boolean isEmpty = false;

    public MyCup(int content) {
        this.content = content;
    }

    public synchronized void pour() {
        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isEmpty = false;
        content++;
        notifyAll();
    }

    public synchronized int sip() {
        while (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isEmpty = true;
        content--;
        notifyAll();
        return content;
    }

    public synchronized int getContent() {
        return content;
    }
}

class CoffeeProducer implements Runnable{
    private MyCup cup;

    public CoffeeProducer(MyCup cup) {
        this.cup = cup;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(" Pour ");
            cup.pour();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class CoffeeConsumer implements Runnable{
    private MyCup cup;

    public CoffeeConsumer(MyCup cup) {
        this.cup = cup;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(" Sip ");
            cup.sip();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ProducerConsumerTest {
    public static void main(String[] args) {
        MyCup cup = new MyCup(0);
        CoffeeProducer producer = new CoffeeProducer(cup);
        CoffeeConsumer consumer = new CoffeeConsumer(cup);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(producer);
        executorService.execute(consumer);

        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final content after producer consumer ran should be 0 :--> " + cup.getContent());
    }
}
