/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_1;

/**
 * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
 * Note that Math.abs(n) returns the absolute value of a number.
 * <p>
 * <p>
 * close10(8, 13) → 8
 * close10(13, 8) → 8
 * close10(13, 7) → 0
 */
public class Close10 {
    public int close10(
            int a,
            int b
    ) {
        int differenceA = Math.abs(10 - a);
        int differenceB = Math.abs(10 - b);
        return (differenceA < differenceB) ? a : (differenceA == differenceB) ? 0 : b;
    }

    public int close10Optimized(
            int a,
            int b
    ) {
        int differenceA = Math.abs(10 - a);
        int differenceB = Math.abs(10 - b);
        if (differenceA < differenceB)
            return a;
        if (differenceB < differenceA)
            return b;
        return 0;
    }

    public static void main(String[] args) {
        Close10 c = new Close10();

        System.out.println(c.close10(8, 13));
        System.out.println(c.close10(13, 8));
        System.out.println(c.close10(13, 7));
        System.out.println(c.close10(13, 13));

        System.out.println(c.close10Optimized(8, 13));
        System.out.println(c.close10Optimized(13, 8));
        System.out.println(c.close10Optimized(13, 7));
        System.out.println(c.close10Optimized(13, 13));


    }

}
