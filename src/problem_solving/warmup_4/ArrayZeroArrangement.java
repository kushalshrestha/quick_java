/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_4;

import java.util.Arrays;

/**
 * could you write a program or logic where you're given a array of integers .,
 * this can contain numbers and 0s as well. Output should have all 0's coming in the last.
 * Input: [3,5,-2, 0 , 0 ,2 ,-100]
 */
public class ArrayZeroArrangement {
    public int[] zeroArrangement(int[] arr) {
        int index = 0;
        int endIndex = arr.length - 1;
        while(index < endIndex){
            System.out.println(arr[index] + " " + index + " " + endIndex);
            System.out.println(Arrays.toString(arr));
            if (arr[index] == 0){
                arr[index] = arr[endIndex];
                arr[endIndex] = 0;
                endIndex--;

            } else {
                index++;
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("---");
        }
        return arr;
    }


    public static void main(String[] args) {
        ArrayZeroArrangement aza = new ArrayZeroArrangement();
        System.out.println(Arrays.toString(aza.zeroArrangement(new int[]{3, 5, -2, 0, 0, 2, -100})));
        System.out.println(Arrays.toString(aza.zeroArrangement(new int[]{0, 0, -2, 0, 0, 2, 0})));
        System.out.println(Arrays.toString(aza.zeroArrangement(new int[]{0, 1, 0, 0})));
    }
}
