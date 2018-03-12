package concurrencynmultithreading;

import java.util.Scanner;

public class ThreadTester2 {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        Fortune fortuneThread = new Fortune("Tuhin", "Mandal", 2000);
        //fortuneThread.setDaemon(true);
        /**
         * Daemon thread is a thread which lives as long as the parent thread
         * which has started is alive. Once the parent thread dies, daemon thread also
         * goes to dead thread
         */
        fortuneThread.start();

        System.out.println("Enter anything--->");
        String name = input.next();
        System.out.println("Input given is = " + name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main slept for 2 seconds");
    }
}
