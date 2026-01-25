/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;
/**


 Given 3 int values, a b c, return their sum.
 However, if any of the values is a teen -- in the range 13..19 inclusive --
 then that value counts as 0, except 15 and 16 do not count as a teens.
 Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule.
 In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
 Define the helper below and at the same indent level as the main noTeenSum().

 noTeenSum(1, 2, 3) → 6
 noTeenSum(2, 13, 1) → 3
 noTeenSum(2, 1, 14) → 3
 * */
public class NoTeenSum {
    public int noTeenSum(int a, int b, int c){
        if(a >= 13 && a<=19){
            a = fixTeen(a);
        }
        if(b >= 13 && b<=19){
            b = fixTeen(b);
        }
        if(c >= 13 && c<=19){
            c = fixTeen(c);
        }

        return a + b + c;
    }

    public int fixTeen(int n){
        if (n == 15 || n == 16) {
            return n;
        }
        return 0;
    }

    public int noTeenSumOptimized(int a, int b, int c){
        return fixTeenOptimized(a) + fixTeenOptimized(b) + fixTeenOptimized(c);
    }

    public int fixTeenOptimized(int n){
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            return 0;
        }
        return n;
    }

    public static void main(String[] args) {
        NoTeenSum ns = new NoTeenSum();

        System.out.println(ns.noTeenSum(1,2,3));
        System.out.println(ns.noTeenSum(2, 13, 1));
        System.out.println(ns.noTeenSum(2, 1, 14));

        System.out.println(ns.noTeenSumOptimized(1,2,3));
        System.out.println(ns.noTeenSumOptimized(2, 13, 1));
        System.out.println(ns.noTeenSumOptimized(2, 1, 14));
    }
}
