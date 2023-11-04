/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package leetcode;

import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = generateSequence(20);
        System.out.println(list);
    }

    public static List<Integer> generateSequence(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n); // Add the current value of n to the list

        // Base case: When n reaches 1, stop
        if (n == 1) {
            return list;
        }

        if (n % 2 == 0) {
            // If n is even, divide it by 2 and continue the sequence
            list.addAll(generateSequence(n / 2));
        } else {
            // If n is odd, multiply it by 3 and add 1 and continue the sequence
            list.addAll(generateSequence((3 * n) + 1));
        }

        return list;
    }
}

