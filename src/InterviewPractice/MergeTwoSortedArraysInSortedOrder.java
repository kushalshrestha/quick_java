/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewPractice;

import java.util.Arrays;

public class MergeTwoSortedArraysInSortedOrder {
    public static void main(String[] args) {
        int[] arr1 = {1, 23, 34, 56, 67, 79};
        int[] arr2 = {32, 43, 56, 453, 6453, 23433, 56456};
        mergeTwoArrays(arr1, arr2);
    }

    private static void mergeTwoArrays(
            int[] arr1,
            int[] arr2
    ) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(mergedArray));

    }
}
