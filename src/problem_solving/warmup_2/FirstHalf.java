/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_2;

/**
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 *
 *
 * firstHalf("WooHoo") → "Woo"
 * firstHalf("HelloThere") → "Hello"
 * firstHalf("abcdef") → "abc"
 * */
public class FirstHalf {
    public String firstHalf(String text){
        return text.substring(0, text.length()/2);
    }

    public static void main(String[] args){
        FirstHalf fh = new FirstHalf();
        System.out.println(fh.firstHalf("WooHoo"));
        System.out.println(fh.firstHalf("HelloThere"));
        System.out.println(fh.firstHalf("abcdef"));
        System.out.println(fh.firstHalf("abcdefg"));
    }
}
