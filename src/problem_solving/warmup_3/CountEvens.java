/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;
/**
 *
 Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.


 countEvens([2, 1, 2, 3, 4]) → 3
 countEvens([2, 2, 0]) → 3
 countEvens([1, 3, 5]) → 0
 * */
public class CountEvens {
    public int countEvens(int[] arr) {
        int sum = 0;
        for(int i=0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) sum+=1;
        }
        return sum;
    }

    public static void main (String[] args){
        CountEvens ce = new CountEvens();

        System.out.println(ce.countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(ce.countEvens(new int[]{2, 2, 0}));
        System.out.println(ce.countEvens(new int[]{1, 3, 5}));
    }
}
