/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestionsByRoadMap.Arrays;

/*
Q: How can you efficiently find the largest subarray with the maximum sum in a given array of integers in Java?
A: Use the Kadane's algorithm to find the maximum subarray sum. It keeps track of the maximum sum ending at each
index and the overall maximum sum.
*/
public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,-1};
        int maxSum = findMaximumSubarraySum(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static int findMaximumSubarraySum(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}

