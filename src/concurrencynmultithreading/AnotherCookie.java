package concurrencynmultithreading;

import java.util.Scanner;

public class AnotherCookie implements Runnable {

    private String first;
    private String last;
    private int sleepyTime;

    public AnotherCookie(String first, String last, int sleepyTime) {
        this.first = first;
        this.last = last;
        this.sleepyTime = sleepyTime;
    }

    @Override
    public void run() {
        while (true) {
            System.out.print(first + " ");
            Thread.yield();
            try {
                Thread.sleep(sleepyTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(last);
        }
    }
}

class TestingAnotherCookie {
    public static void main(String[] args) {
        AnotherCookie cookie1 = new AnotherCookie("TW", " Was great", 1000);
        AnotherCookie cookie2 = new AnotherCookie("THW", " Was great as well", 1000);
        Thread thread1 = new Thread(cookie1);
        Thread thread2 = new Thread(cookie2);
        thread1.start();
        thread2.start();
        try {
            thread1.join(); // here main thread is waiting on thread1 to finish.
            // but this thread will never finish because it is running in an infinite loop, so scanner input will
            // never get called
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("command line input  = " + name);
        System.out.println("Main thread is exiting");
    }
}
