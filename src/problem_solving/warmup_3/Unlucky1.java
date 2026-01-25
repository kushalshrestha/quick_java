/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;
/**
 *
 We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
 Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.


 unlucky1([1, 3, 4, 5]) → true
 unlucky1([2, 1, 3, 4, 5]) → true
 unlucky1([1, 1, 1]) → false
 * */
public class Unlucky1 {
    public boolean unlucky1(int[] arr){
        if((arr[0] == 1 && arr[1] == 3)|| (arr[1] == 1 && arr[2] == 3) || (arr[arr.length-2] == 1 && arr[arr.length - 1] == 3)){
            return true;
        }

        return false;
    }

    public static void main(String[] args){
        Unlucky1 un = new Unlucky1();

        System.out.println(un.unlucky1(new int[]{1,3,4,5}));
        System.out.println(un.unlucky1(new int[]{2, 1,3,4}));
        System.out.println(un.unlucky1(new int[]{1,1,1}));
    }
}
