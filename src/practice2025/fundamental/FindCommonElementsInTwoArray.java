/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.fundamental;

import java.util.Arrays;
import java.util.HashSet;

public class FindCommonElementsInTwoArray {
    public static void main(String[] args) {
        Integer[] array1 = {1,2,3};
        Integer[] array2 = {3, 4, 5};

        System.out.println(findCommonElements(array1, array2));
    }

    private static HashSet findCommonElements(Integer[] t1, Integer[] t2) {
        HashSet set = new HashSet<>(Arrays.asList(t1));
        HashSet commonSet = new HashSet<>();

        for (Integer i : t2){
            if (set.contains(i)) {
                commonSet.add(i);
            }
        }

        return commonSet;
    }
}
