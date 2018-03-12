package concurrencynmultithreading.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Deadlock {

    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s" + "  has bowed to me!%n", this.name, bower.getName());
            bower.bowBck(this);
        }

        private synchronized void bowBck(Friend bower) {
            System.out.format("%s: %s" + " has bowed back to me!%n", this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend bob = new Friend("Bob");
        final Friend rob = new Friend("Rob");
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Thread(new Runnable() {
            @Override
            public void run() {
                bob.bow(rob);
            }
        }));
        executorService.execute(new Thread(new Runnable() {
            @Override
            public void run() {
                rob.bow(bob);
            }
        }));
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
