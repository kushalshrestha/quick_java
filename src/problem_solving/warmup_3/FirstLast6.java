/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;

/**
 * Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
 * <p>
 * <p>
 * firstLast6([1, 2, 6]) → true
 * firstLast6([6, 1, 2, 3]) → true
 * firstLast6([13, 6, 1, 2, 3]) → false
 */
public class FirstLast6 {
    public boolean firstLast6(int[] arr) {
        return (arr[0] == 6 || arr[arr.length - 1] == 6);
    }

    public static void main(String[] args){
        FirstLast6 fl = new FirstLast6();

        System.out.println(fl.firstLast6(new int[]{1, 2, 6}));
        System.out.println(fl.firstLast6(new int[]{6, 1, 2, 3}));
        System.out.println(fl.firstLast6(new int[]{13, 6, 1, 2, 3}));
    }
}
