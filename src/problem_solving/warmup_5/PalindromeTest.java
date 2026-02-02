/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_5;

public class PalindromeTest {
    public static void main(String[] args) {
        System.out.println(isPalindrome("test"));
        System.out.println(isPalindrome("caac"));
    }


    private static boolean isPalindrome(String word) {
        String reversedWord = reverseWord(word);
        return word.equals(reversedWord);
    }

    private static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder();
        for(int i=word.length()-1; i >=0; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }

    private static String reverseWordOptimized(String word) {
        StringBuilder sb = new StringBuilder();
        return new StringBuilder(word).reverse().toString();
    }
}
