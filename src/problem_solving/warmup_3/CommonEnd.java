/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;

/**
 * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
 * <p>
 * <p>
 * commonEnd([1, 2, 3], [7, 3]) → true
 * commonEnd([1, 2, 3], [7, 3, 2]) → false
 * commonEnd([1, 2, 3], [1, 3]) → true
 */
public class CommonEnd {
    public boolean commonEnd(
            int[] a,
            int[] b
    ) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static void main(String[] args) {
        CommonEnd ce = new CommonEnd();

        System.out.println(ce.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        System.out.println(ce.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        System.out.println(ce.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
    }
}
