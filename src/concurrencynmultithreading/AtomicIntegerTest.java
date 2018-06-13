package concurrencynmultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;


/**
 * The package java.concurrent.atomic contains many useful classes to perform atomic operations. An operation is atomic
 * when you can safely perform the operation in parallel on multiple threads without using the synchronized keyword or
 * locks as shown in my previous tutorial.
 *
 * Internally, the atomic classes make heavy use of compare-and-swap (CAS), an atomic instruction directly supported by
 * most modern CPUs. Those instructions usually are much faster than synchronizing via locks. So my advice is to prefer
 * atomic classes over locks in case you just have to change a single mutable variable concurrently.
 *
 *
 * By using atomic integer as a replacement of primitive type integer we are able to increment the integer value
 * concurrently in a thread safe manner without using the synchronized keyword.
 * The method incrementAndGet() is an atomic operation so that we can safely call it from multiple threads.
 *
 *
 * AtomicInteger supports various kinds of atomic operations. The method updateAndGet() accepts a lambda
 */
public class AtomicIntegerTest {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        IntStream.range(0, 1000)
                .forEach(i -> executorService.submit(atomicInteger::incrementAndGet));

        executorService.shutdown();

        System.out.println(atomicInteger.get());
    }
}
