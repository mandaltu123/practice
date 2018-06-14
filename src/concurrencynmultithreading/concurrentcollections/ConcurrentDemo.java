package concurrencynmultithreading.concurrentcollections;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentDemo implements Runnable {

    static List<String> list = new ArrayList<>();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child thread is going to add elements");
        list.add("D");
    }

    public static void main(String[] args) throws InterruptedException {
        list.add("A");
        list.add("B");
        list.add("C");
        ConcurrentDemo concurrentDemo = new ConcurrentDemo();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(concurrentDemo);
        Iterator<String> iterator = list.iterator();
        try {
            while (iterator.hasNext()) {
                String s = iterator.next();
                System.out.println(s);
                Thread.sleep(4000);
            }
        } finally {
            executorService.shutdown();
        }

        System.out.println(list.toString());
    }
}

class ConcurrentUtilsDemo implements Runnable {

    static CopyOnWriteArrayList l = new CopyOnWriteArrayList();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Child Thread"
                    + " going to add element");
        }

        // Child thread trying to add new
        // element in the Collection object
        l.add("D");
    }

    public static void main(String[] args) throws InterruptedException {
        l.add("A");
        l.add("B");
        l.add("c");

        // We create a child thread that is
        // going to modify ArrayList l.
        ConcurrentUtilsDemo t = new ConcurrentUtilsDemo();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(t);

        // Now we iterate through the ArrayList
        // and get exception.
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            String s = (String) itr.next();
            System.out.println(s);
            Thread.sleep(6000);
        }
        System.out.println(l);
        executorService.shutdown();
    }
}
