/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;

import java.util.Arrays;

/**
 * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 * <p>
 * <p>
 * reverse3([1, 2, 3]) → [3, 2, 1]
 * reverse3([5, 11, 9]) → [9, 11, 5]
 * reverse3([7, 0, 0]) → [0, 0, 7]
 */
public class Reverse3 {
    public int[] reverse3(int[] arr) {
        int[] newArray = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArray[index] = arr[i];
            index++;
        }

        return newArray;
    }

    public static void main(String[] args){
        Reverse3 r3 = new Reverse3();

        System.out.println(Arrays.toString(r3.reverse3(new int[]{1,2,3})));
    }
}
