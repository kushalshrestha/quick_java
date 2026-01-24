/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_2;

/**
 * Given an array of ints, return the number of 9's in the array.
 * <p>
 * <p>
 * arrayCount9([1, 2, 9]) → 1
 * arrayCount9([1, 9, 9]) → 2
 * arrayCount9([1, 9, 9, 3, 9]) → 3
 */
public class ArrayCount9 {
    public int arrayCount9(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayCount9 ar = new ArrayCount9();
        System.out.println(ar.arrayCount9(new int[]{1, 2, 9}));
        System.out.println(ar.arrayCount9(new int[]{1, 9, 9}));
        System.out.println(ar.arrayCount9(new int[]{1, 9, 9, 3, 9}));
    }
}
