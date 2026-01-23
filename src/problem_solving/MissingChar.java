/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving;

/*
* Given a non-empty string and an int n, return a new string where the char at index n has been removed.
* The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).


missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
* */
public class MissingChar {
    public String missingChar(
            String text,
            int n
    ) {
        return text.substring(0, n) + text.substring(n + 1);
    }


    public static void main(String[] args) {
        MissingChar mc = new MissingChar();

        System.out.println(mc.missingChar("kitten", 1));
        System.out.println(mc.missingChar("kitten", 0));
        System.out.println(mc.missingChar("kitten", 4));
    }
}
