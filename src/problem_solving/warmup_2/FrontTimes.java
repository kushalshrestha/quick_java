/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_2;
/**
 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3.
 * Return n copies of the front;
 *
 *
 * frontTimes("Chocolate", 2) → "ChoCho"
 * frontTimes("Chocolate", 3) → "ChoChoCho"
 * frontTimes("Abc", 3) → "AbcAbcAbc"
 * */
public class FrontTimes {
    public String frontTimes (String a, int n) {
        String first3Char = a.substring(0,3);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < n; i++) {
            sb.append(first3Char);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        FrontTimes ft = new FrontTimes();

        System.out.println(ft.frontTimes("Chocolate", 2));
        System.out.println(ft.frontTimes("Chocolate", 3));
        System.out.println(ft.frontTimes("Abc", 3));
    }
}
