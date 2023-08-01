/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestionsByRoadMap.Arrays;

/*
Q: How can you find the second smallest element in an integer array in Java?
A: One way is to sort the array and then access the element at index 1 (the second smallest element).
Another approach is to use a loop to find the smallest and second smallest elements in a single pass.
*/
public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 9, 1, 5, 3 };
        int secondSmallest = findSecondSmallestUsingLoop(arr);
        System.out.println("Second Smallest Element (using loop): " + secondSmallest);
    }

    public static int findSecondSmallestUsingLoop(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }
}
