/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;
/**
 *
 Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


 twoAsOne(1, 2, 3) → true
 twoAsOne(3, 1, 2) → true
 twoAsOne(3, 2, 2) → false
 * */
public class TwoAsOne {
    public boolean twoAsOne(int a, int b, int c){
        int[] arr = new int[]{a, b, c};
        for(int i = 0; i<3; i++){
            int sum = 0;
            int checksum = arr[i];
            for (int j = 0; j<3; j++) {
                if(i!=j) {
                    sum += arr[j];
                }
            }
            if (sum == checksum) return true;
        }
        return false;
    }

    public boolean twoAsOneOptimized(int a, int b, int c){
        return (a+b == c || a+c == b || b + c == a);
    }


    public static void main(String[] args){
        TwoAsOne to = new TwoAsOne();

        System.out.println(to.twoAsOne(1,2,3));
        System.out.println(to.twoAsOne(3, 1,2));
        System.out.println(to.twoAsOne(3,2,2));
        System.out.println(to.twoAsOneOptimized(1,2,3));
        System.out.println(to.twoAsOneOptimized(3, 1,2));
        System.out.println(to.twoAsOneOptimized(3,2,2));
    }
}
