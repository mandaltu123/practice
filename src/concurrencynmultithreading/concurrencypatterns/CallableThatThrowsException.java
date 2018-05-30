package concurrencynmultithreading.concurrencypatterns;

import java.util.concurrent.*;

public class CallableThatThrowsException {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> task = () ->
        {
            throw new IllegalStateException("Throwing some exception: "+ Thread.currentThread().getName());
        };

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        try
        {
            for(int i = 0; i < 10; i++)
            {
                Future<String> future = executorService.submit(task);
                System.out.println(future.get());
            }
        } finally
        {
            executorService.shutdown();
        }
    }
}
