/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestionsByRoadMap.Arrays;

import java.util.Arrays;
import java.util.HashSet;

/*
Q: Implement a generic method in Java to find the common elements in two arrays of any type T.
A: Use HashSet or HashMap to store elements from one array and then iterate through the second
array to find the common elements.
*/
public class CommonElementsFinder {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {3, 4, 5, 6, 7};

        HashSet<Integer> commonElements = findCommonElements(arr1, arr2);
        System.out.println("Common Elements: " + commonElements);
    }

    private static <T> HashSet<T> findCommonElements(
            T[] arr1,
            T[] arr2
    ) {
        HashSet<T> set = new HashSet<>(Arrays.asList(arr1));
        HashSet<T> commonSet = new HashSet<>();

        for (T element : arr2) {
            if (set.contains(element)) {
                commonSet.add(element);
            }
        }
        return commonSet;
    }
}
