/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_1;
/*
* Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
* */
public class NearHundred {
    public boolean nearHundred(int n) {
        int difference = 100 - n;
        int differenceFrom200 = 200 - n;
        return (Math.abs(difference) <= 10) || (Math.abs(differenceFrom200) <= 10);

    }

    public boolean nearHundredOptimized(int n) {
        return (Math.abs(100 - n) <= 10 || (Math.abs(200 - n) <= 10));
    }

    public static void main (String[] args) {
        NearHundred nh = new NearHundred();

        System.out.println(nh.nearHundred(93));
        System.out.println(nh.nearHundred(90));
        System.out.println(nh.nearHundred(89));
    }
}
