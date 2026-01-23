/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

/*
* Given two int values, return their sum. Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
* */
package problem_solving;

public class SumDouble {
    public int sumDouble(int a, int b){
        return a == b ? 2*(a+b) : a + b;
    }

    public int sumDoubleOptimized(int a, int b){
        int sum = a + b;
        return a == b ? 2 * sum : sum;
    }

    public static void main(String[] args) {
        SumDouble sd = new SumDouble();

        System.out.println(sd.sumDouble(1,2));
        System.out.println(sd.sumDouble(3,2));
        System.out.println(sd.sumDouble(2,2));

        System.out.println(sd.sumDoubleOptimized(1,2));
        System.out.println(sd.sumDoubleOptimized(3,2));
        System.out.println(sd.sumDoubleOptimized(2,2));


    }
}
