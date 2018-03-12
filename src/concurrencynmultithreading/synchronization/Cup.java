package concurrencynmultithreading.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Cup {

    private int coffee;

    public Cup(int coffee) {
        this.coffee = coffee;
    }

    public synchronized int getCoffee() {
        return coffee;
    }

    public synchronized void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public synchronized void drink() {
        int localCoffee = coffee;
        localCoffee--;
        System.out.print(" Sip ");
        try {
            Thread.sleep((long) (100 * Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        coffee = localCoffee;
    }

    public synchronized void pour() {
        int localCoffee = coffee;
        localCoffee++;
        System.out.print(" pour ");
        try {
            Thread.sleep((long) (100 * Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        coffee = localCoffee;
    }
}

class CoffeeTester {
    public static void main(String[] args) {
        Cup cup = new Cup(0);
        Customer customer = new Customer(cup);
        Waiter waiter = new Waiter(cup);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(customer);
        executorService.execute(waiter);

        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" \n Final coffee value is = " + cup.getCoffee());
    }
}
