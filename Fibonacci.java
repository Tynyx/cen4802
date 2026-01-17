import java.util.Scanner;
/*
 Class: CEN 4802 Software Int, Config, and Test
 Author: LaTroy Richardson
 Date: 16 Jan 2026
 */

/**
 * Class: Fibonacci class use one method to base of fibonacci and calculate the nth, and the
 * second method to print of the results of the number
 * demonstrates the sequence of fibonacci to the nth level whichever level the n will be
 */
public class Fibonacci {

    /**
     * This method is what handles the base logic of the fibonacci sequence and calculate the nth
     * @param n  is the number to what index of fibonacci we are calculating
     * @return the actual number from the fibonacci sequence by nth
     */
    public static long fibonacci(int n) {



        if (n <= 1) {
            return n;
        }
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }

    /**
     * Program entry point.  Reads the n as 10, print the results of the fibonacci sequence
     * @param args Command-line arguments, usually unused
     */
    public static void main(String[] args) {



        System.out.println("The tenth Fibonacci number is: " + fibonacci(10));

    }
}
