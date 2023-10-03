/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewPractice;

public class SecondHighestNumber {
    public static void main(String[] args) {

        int[] arr = {2,3,6,4,8,9,100, 1,45};
        displaySecondHighestNumber(arr);
        System.out.println("""
                                   Time Complexity:
                                                                      
                                   The time complexity of this method is O(n), where 'n' is the length of the input array arr. This is because it iterates through the entire array once, checking each element to determine the highest and second-highest values.
                                                                      
                                   In the worst case, it performs two passes through the array: one to find the highest value and another to find the second-highest value. However, since both passes are directly proportional to the size of the input array 'n,' the overall time complexity remains O(n).
                                                                      
                                   Space Complexity:
                                                                      
                                   The space complexity of this method is O(1), which means it uses a constant amount of extra space regardless of the size of the input array. It uses only two integer variables (highest and secondHighest) to keep track of the highest and second-highest values. These variables are independent of the input size and do not grow with the size of the array.
                                                                      
                                   In summary, the time complexity is O(n), and the space complexity is O(1) for the displaySecondHighestNumber method.
                                   """);

    }

    private static void displaySecondHighestNumber(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > highest) {
                highest = n;
            } else if (n > secondHighest && n != highest) {
                secondHighest = n;
            }
        }
        System.out.println("The second highest number is : " + secondHighest);
    }

}
