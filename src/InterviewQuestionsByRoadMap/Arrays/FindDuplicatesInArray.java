/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestionsByRoadMap.Arrays;

import java.util.HashSet;

/*
Q: How can you efficiently find duplicates in an unsorted array of integers in Java?
A: You can use a HashSet to keep track of visited elements while iterating through the array.
If an element is already present in the HashSet, it is a duplicate.
*/
public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 8, 3, 4, 2, 6, 7, 1, 8 };

        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                duplicates.add(num);
            } else {
                set.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicates found: " + duplicates);
        }
    }
}
