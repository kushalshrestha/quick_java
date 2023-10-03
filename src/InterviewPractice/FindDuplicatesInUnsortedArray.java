/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewPractice;


import java.util.HashSet;

public class FindDuplicatesInUnsortedArray {

    public static void main(String[] args) {
        int[] arr = {23,43,5,234,234,23,43,65};
//        int[] arr = {23,43,5,234};
        findDuplicates(arr);
    }

    private static void findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(int number : arr) {
            if (!set.contains(number)) {
                set.add(number);
            } else {
                duplicates.add(number);
            }
        }

        if(duplicates.isEmpty()) {
            System.out.println("No duplicates");
        } else {
            System.out.println("Duplicates found: " + duplicates);
        }
    }
}
