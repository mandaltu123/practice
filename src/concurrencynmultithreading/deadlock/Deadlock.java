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

/**
 * Here is the JVisualVm thread dump
 *
 *
 *
 * Found one Java-level deadlock:
 =============================
 "pool-1-thread-2":
 waiting to lock monitor 0x00007f97df8394a8 (object 0x000000079579b580, a concurrencynmultithreading.deadlock.Deadlock$Friend),
 which is held by "pool-1-thread-1"
 "pool-1-thread-1":
 waiting to lock monitor 0x00007f97df838008 (object 0x000000079579b5c0, a concurrencynmultithreading.deadlock.Deadlock$Friend),
 which is held by "pool-1-thread-2"

 Java stack information for the threads listed above:
 ===================================================
 "pool-1-thread-2":
 at concurrencynmultithreading.deadlock.Deadlock$Friend.bowBck(Deadlock.java:26)
 - waiting to lock <0x000000079579b580> (a concurrencynmultithreading.deadlock.Deadlock$Friend)
 at concurrencynmultithreading.deadlock.Deadlock$Friend.bow(Deadlock.java:22)
 - locked <0x000000079579b5c0> (a concurrencynmultithreading.deadlock.Deadlock$Friend)
 at concurrencynmultithreading.deadlock.Deadlock$2.run(Deadlock.java:43)
 at java.lang.Thread.run(Thread.java:748)
 at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
 at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
 at java.lang.Thread.run(Thread.java:748)
 "pool-1-thread-1":
 at concurrencynmultithreading.deadlock.Deadlock$Friend.bowBck(Deadlock.java:26)
 - waiting to lock <0x000000079579b5c0> (a concurrencynmultithreading.deadlock.Deadlock$Friend)
 at concurrencynmultithreading.deadlock.Deadlock$Friend.bow(Deadlock.java:22)
 - locked <0x000000079579b580> (a concurrencynmultithreading.deadlock.Deadlock$Friend)
 at concurrencynmultithreading.deadlock.Deadlock$1.run(Deadlock.java:37)
 at java.lang.Thread.run(Thread.java:748)
 at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
 at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
 at java.lang.Thread.run(Thread.java:748)

 Found 1 deadlock.


 *
 */
