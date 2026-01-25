/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;

import java.util.Arrays;

/**
 * Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
 * <p>
 * <p>
 * fix23([1, 2, 3]) → [1, 2, 0]
 * fix23([2, 3, 5]) → [2, 0, 5]
 * fix23([1, 2, 1]) → [1, 2, 1]
 */
public class Fix23 {
    public int[] fix23(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 2 && arr[i + 1] == 3) {
                arr[i + 1] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Fix23 f = new Fix23();
        System.out.println(Arrays.toString(f.fix23(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(f.fix23(new int[]{2, 3, 5})));
        System.out.println(Arrays.toString(f.fix23(new int[]{1, 2, 1})));
    }

}
