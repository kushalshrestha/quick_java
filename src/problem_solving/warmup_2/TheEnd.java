/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_2;
/**
 * Given a string, return a string length 1 from its front, unless front is false, in which case return a string
 * length 1 from its back. The string will be non-empty.
 *
 *
 * theEnd("Hello", true) → "H"
 * theEnd("Hello", false) → "o"
 * theEnd("oh", true) → "o"
 * */
public class TheEnd {
    public String theEnd(String a, boolean status) {
        return status ? a.substring(0, 1) : a.substring(a.length()-1);
    }

    public static void main(String[] args) {
        TheEnd te = new TheEnd();

        System.out.println(te.theEnd("Hello", true));
        System.out.println(te.theEnd("Hello", false));
        System.out.println(te.theEnd("oh", true));
    }
}
