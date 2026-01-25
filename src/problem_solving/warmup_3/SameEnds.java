/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;

/**
 *
 Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.

1, 2, 3, 4
 0, 1, 2, 3


 sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
 sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
 sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
 * */
public class SameEnds {
    public boolean sameEnds(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[arr.length - n + i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SameEnds se = new SameEnds();
        System.out.println(se.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1));
        System.out.println(se.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2));
        System.out.println(se.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3));
    }
}
