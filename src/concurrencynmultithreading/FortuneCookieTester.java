package concurrencynmultithreading;

import java.util.Scanner;

public class FortuneCookieTester {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FortuneCookie cookie1 = new FortuneCookie("you will always", "travel to interesting places", 1000);
        FortuneCookie cookie2 = new FortuneCookie("good things will come your way", "keep working at it", 1000);
        cookie1.start();
        cookie2.start();
        System.out.println("Input any >>");
        String input = in.next();
        System.out.println("input is = " + input);
        System.out.println("Exiting main method.");
    }
}
