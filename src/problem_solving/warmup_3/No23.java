/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;

/**
 * Given an int array length 2, return true if it does not contain a 2 or 3.
 *
 *
 * no23([4, 5]) → true
 * no23([4, 2]) → false
 * no23([3, 5]) → false
 * */
public class No23 {
    public boolean no23(int[] arr){
       return !(arr[0] == 2 || arr[1] == 2 || arr[0] == 3 || arr[1] == 3);
    }

    public static void main(String[] args){
        No23 n = new No23();

        System.out.println(n.no23(new int[]{4, 5}));
        System.out.println(n.no23(new int[]{4, 2}));
        System.out.println(n.no23(new int[]{3, 5}));
    }
}
