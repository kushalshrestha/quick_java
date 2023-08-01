/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestionsByRoadMap.Arrays;

import java.util.Arrays;

/*
Q: Write a Java method to rotate a given array to the right by k positions without using extra space.
A: Use a three-step reversal algorithm. Reverse the entire array, then reverse the first k elements,
and finally, reverse the remaining n-k elements.
*/
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(arr));
        rotateArrayToRight(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    public static void rotateArrayToRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; //Only required if we need to handle cases where k is greater than the array length

        // Step 1: Reverse the entire array
        reverseArray(arr, 0, n - 1);
        System.out.println("1. Reversed Entire Array: " + Arrays.toString(arr));

        // Step 2: Reverse the first k elements
        reverseArray(arr, 0, k - 1);
        System.out.println("2. Reversed First k elements in an Array: " + Arrays.toString(arr));

        // Step 3: Reverse the remaining n - k elements
        reverseArray(arr, k, n - 1);
        System.out.println("2. Reversed remaining n-k elements in an Array: " + Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

