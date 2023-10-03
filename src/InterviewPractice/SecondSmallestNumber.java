/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewPractice;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {123,234,54,21,543,12,1,5};
        displaySecondHighestNumber(arr);
    }

    private static void displaySecondHighestNumber(int[] arr) {
        int smallestNumber = Integer.MAX_VALUE;
        int secondSmallestNumber = Integer.MAX_VALUE;

        for (int n : arr) {
            if(n < smallestNumber) smallestNumber = n;
            else if (n < secondSmallestNumber && n != smallestNumber) secondSmallestNumber = n;
        }
        System.out.println("Second Smallest Number is : " + secondSmallestNumber);
    }
}
