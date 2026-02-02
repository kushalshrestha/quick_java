/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_5;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        printFibonacci(0, 1, 10);
    }

    private static void printFibonacci(int a, int b, int length){
        if(length == 0) {
            return;
        }

        int sum = a + b;
        a = b;
        b = sum;
        System.out.println( a + " ");
        printFibonacci(a, b, length - 1);

    }
}
