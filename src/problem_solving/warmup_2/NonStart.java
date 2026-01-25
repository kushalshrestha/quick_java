/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_2;
/**
 *
 Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.


 nonStart("Hello", "There") → "ellohere"
 nonStart("java", "code") → "avaode"
 nonStart("shotl", "java") → "hotlava"
 * */
public class NonStart {
    public String nonStart(String a, String b){
        return a.substring(1) + b.substring(1);
    }

    public static void main(String[] args){
        NonStart ns = new NonStart();

        System.out.println(ns.nonStart("Hello", "There"));
        System.out.println(ns.nonStart("java", "code"));
        System.out.println(ns.nonStart("shotl", "java"));
    }
}
