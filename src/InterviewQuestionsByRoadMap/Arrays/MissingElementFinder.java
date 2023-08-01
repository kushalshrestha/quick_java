/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestionsByRoadMap.Arrays;

/*
Q: Given an array containing elements from 1 to n with one missing element, how can you
find the missing element in Java?
A: Calculate the sum of all elements from 1 to n using the formula (n * (n + 1)) / 2.
Then subtract the sum of the elements in the array from it to find the missing element.
*/
public class MissingElementFinder {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };

        int n = arr.length + 1; // Array length is n - 1, so actual length is n
        int missingElement = findMissingElement(arr, n);
        System.out.println("Missing Element: " + missingElement);
    }

    public static int findMissingElement(int[] arr, int n) {
        // Calculate the expected sum of elements from 1 to n
        int expectedSum = (n * (n + 1)) / 2;

        // Calculate the sum of elements in the given array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Find the missing element by subtracting the actual sum from the expected sum
        return expectedSum - actualSum;
    }
}

