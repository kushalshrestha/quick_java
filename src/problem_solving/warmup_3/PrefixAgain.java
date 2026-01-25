/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;

/**
 * Given a string, consider the prefix string made of the first N chars of the string.
 * Does that prefix string appear somewhere else in the string?
 * Assume that the string is not empty and that N is in the range 1..str.length().
 *
 *
 * prefixAgain("abXYabc", 1) → true
 * prefixAgain("abXYabc", 2) → true
 * prefixAgain("abXYabc", 3) → false
 */
public class PrefixAgain {
    public boolean prefixAgain(String text, int n){
        String prefix = text.substring(0, n);
        String remainingText = text.substring(n);

        if (remainingText.contains(prefix)) return true;
        return false;
    }

    public static void main(String[] args) {
        PrefixAgain pfa = new PrefixAgain();

        System.out.println(pfa.prefixAgain("abXYabc", 1));
        System.out.println(pfa.prefixAgain("abXYabc", 2));
        System.out.println(pfa.prefixAgain("abXYabc", 3));
    }
}
