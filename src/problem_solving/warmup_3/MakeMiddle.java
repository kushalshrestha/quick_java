/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;

import java.util.Arrays;

/**
 * Given an array of ints of even length, return a new array length 2 containing the middle two elements
 * from the original array. The original array will be length 2 or more.
 * <p>
 * <p>
 * makeMiddle([1, 2, 3, 4]) → [2, 3]
 * makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
 * makeMiddle([1, 2]) → [1, 2]
 */
public class MakeMiddle {
    public int[] makeMiddle(int[] arr) {
        int[] newArray = new int[2];
        newArray[0] = arr[(arr.length / 2) - 1];
        newArray[1] = arr[arr.length / 2];
        return newArray;
    }

    public static void main(String[] args) {
        MakeMiddle mm = new MakeMiddle();

        System.out.println(Arrays.toString(mm.makeMiddle(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(mm.makeMiddle(new int[]{1, 2, 3, 4, 9})));
        System.out.println(Arrays.toString(mm.makeMiddle(new int[]{1, 2})));
    }
}
