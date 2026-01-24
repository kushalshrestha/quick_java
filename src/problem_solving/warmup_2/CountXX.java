/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_2;

/**
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 *
 *
 * countXX("abcxx") → 1
 * countXX("xxx") → 2
 * countXX("xxxx") → 3
 * */
public class CountXX {
    public int CountXX(String a){
        int count = 0;
        for(int i = 0; i < a.length() - 1; i++){
            if (a.charAt(i) == 'x' && a.charAt(i + 1) == 'x') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountXX cx = new CountXX();

        System.out.println(cx.CountXX("abcxx"));
        System.out.println(cx.CountXX("xxx"));
        System.out.println(cx.CountXX("xxxx"));
    }
}
