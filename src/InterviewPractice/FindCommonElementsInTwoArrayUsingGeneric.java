/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindCommonElementsInTwoArrayUsingGeneric {
    public static void main(String[] args) {
        Integer[] numberArray1 = {1,2,3};
        Integer[] numberArray2 = {2,4,6};

        System.out.println(findCommonElements(numberArray1, numberArray2));

        String[] stringArray1 = {"Kushal", "Anil", "Kushal"};
        String[] stringArray2 = {"Bhim", "Shreemaya", "Kushal"};
        System.out.println(findCommonElements(stringArray1, stringArray2));

    }

    private static <T> HashSet<T> findCommonElements(T[] t1, T[] t2) {
        HashSet<T> set = new HashSet<>(Arrays.asList(t1));
        HashSet<T> commonSet = new HashSet<>();

        for(T element : t2) {
            if (set.contains(element)) {
                commonSet.add(element);
            }
        }

        return commonSet;
    }
}
