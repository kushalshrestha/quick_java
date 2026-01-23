/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving;
/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
Use the % "mod" operator -- see Introduction to Mod


or35(3) → true
or35(10) → true
or35(8) → false
 */
public class Or35 {
    public boolean or35(int n) {
        if (n < 0) return false;
        return n % 3 == 0 || n % 5 == 0;
    }

    public boolean or35Optimized(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public static void main (String[] args) {
        Or35 or = new Or35();

        System.out.println(or.or35(3));
        System.out.println(or.or35(10));
        System.out.println(or.or35(8));

        System.out.println(or.or35Optimized(3));
        System.out.println(or.or35Optimized(10));
        System.out.println(or.or35Optimized(8));
    }
}
