package concurrencynmultithreading.concurrencypatterns;

import java.util.concurrent.Callable;

public class ExceptionCallable {


    public static void main(String[] args) {
        Callable<String> task = () -> doSomething();
    }

    private static String doSomething() {
        try
        {
            throw new Exception("some exception");
        } catch (Exception e){

        }
        return "test";
    }
}
