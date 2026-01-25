/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_2;

/**
 * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
 * <p>
 * <p>
 * arrayFront9([1, 2, 9, 3, 4]) → true
 * arrayFront9([1, 2, 3, 4, 9]) → false
 * arrayFront9([1, 2, 3, 4, 5]) → false
 */

public class ArrayFront9 {
    public boolean arrayFront9(int[] arr) {
        for (int i = 0; i < 4; i++) {
            if (arr[i] == 9)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayFront9 ac = new ArrayFront9();

        System.out.println(ac.arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(ac.arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(ac.arrayFront9(new int[]{2, 3, 4, 5}));
    }
}
