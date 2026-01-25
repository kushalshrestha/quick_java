/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_2;
/**
 *
 Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".
 Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.


 makeOutWord("<<>>", "Yay") → "<<Yay>>"
 makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
 makeOutWord("[[]]", "word") → "[[word]]"
 * */
public class MakeOutWord {
    public String makeOutWord(String outText, String text){
        String preOutText = outText.substring(0,2);
        String postOutText = outText.substring(2);
        return preOutText + text + postOutText;
    }

    public static void main(String[] args){
        MakeOutWord mow = new MakeOutWord();

        System.out.println(mow.makeOutWord("<<>>", "You"));
        System.out.println(mow.makeOutWord("<<>>", "WooHoo"));
        System.out.println(mow.makeOutWord("[[]]", "word"));
    }
}
