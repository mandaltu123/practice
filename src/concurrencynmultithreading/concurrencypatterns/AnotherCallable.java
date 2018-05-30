package concurrencynmultithreading.concurrencypatterns;

import java.util.concurrent.*;

public class AnotherCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Callable<String> task = () ->
        {
            Thread.sleep(600);
            return "I am in thread: " + Thread.currentThread().getName();
        };

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        try {
            for (int i = 0; i < 10; i++) {
                Future<String> submit = executorService.submit(task);
                System.out.println("I got => " + submit.get(100, TimeUnit.MILLISECONDS)); // This is going to throw
                // TimeoutException. Because we have set time out here as 100 milliseconds but  simulated Runnable tasks
                // takes 600 milliseconds to execute. So none of the tasks will be executed here
            }
        } finally {
            executorService.shutdown();
        }


        /**
         * Sample output of this program is:
         *
         * Exception in thread "main" java.util.concurrent.TimeoutException
         * 	at java.util.concurrent.FutureTask.get(FutureTask.java:205)
         * 	at concurrencynmultithreading.concurrencypatterns.AnotherCallable.main(AnotherCallable.java:18)
         *
         *
         *
         *
         *
         */
    }
}
