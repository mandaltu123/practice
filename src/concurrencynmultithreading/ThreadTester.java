package concurrencynmultithreading;

import java.util.Scanner;

public class ThreadTester {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter anything--->");
        String name = input.next();
        System.out.println("Input provided is " + name);
        System.out.println("The input request is satisfied");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("here we slept for 3 second");
    }
}
