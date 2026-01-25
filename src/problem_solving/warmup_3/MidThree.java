/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;

import java.util.Arrays;

/**
 * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
 * <p>
 * <p>
 * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
 * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
 * midThree([1, 2, 3]) → [1, 2, 3]
 */
public class MidThree {
    public int[] midThree(int[] arr) {
        int[] newArray = new int[3];
        int middle = arr.length / 2;
        return new int[]{arr[middle - 1], arr[middle], arr[middle + 1]};
    }

    public static void main(String[] args) {
        MidThree mt = new MidThree();

        System.out.println(Arrays.toString(mt.midThree(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(mt.midThree(new int[]{8, 6, 7, 5, 3, 0, 9})));
        System.out.println(Arrays.toString(mt.midThree(new int[]{1, 2, 3})));
    }
}
