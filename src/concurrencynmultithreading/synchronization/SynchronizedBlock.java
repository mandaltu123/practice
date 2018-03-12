package concurrencynmultithreading.synchronization;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronizedBlock {

    private List<String> nameList = new ArrayList<>();
    public void print(String arg) {
        synchronized (this) {
            nameList.add(arg);
            System.out.println("hello there #" + arg);
        }
    }

    public synchronized List<String> getNameList() {
        return nameList;
    }
}

class ThreadOne implements Runnable {
    private SynchronizedBlock block;

    public ThreadOne(SynchronizedBlock block) {
        this.block = block;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            block.print("ThreadOne" +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadTwo implements Runnable {
    private SynchronizedBlock block;

    public ThreadTwo(SynchronizedBlock block) {
        this.block = block;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            block.print("ThreadTwo" +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BlockTester {
    public static void main(String[] args) {
        SynchronizedBlock block = new SynchronizedBlock();
        ThreadOne threadOne = new ThreadOne(block);
        ThreadTwo threadTwo = new ThreadTwo(block);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(threadOne);
        executorService.execute(threadTwo);
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
        System.out.println("The final nameList = " + block.getNameList());
    }
}
