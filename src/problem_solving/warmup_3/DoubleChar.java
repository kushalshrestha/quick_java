/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;
/**
 * Given a string, return a string where for every char in the original, there are two chars.
 *
 *
 * doubleChar("The") → "TThhee"
 * doubleChar("AAbb") → "AAAAbbbb"
 * doubleChar("Hi-There") → "HHii--TThheerree"
 * */
public class DoubleChar {
    public String doubleChar(String text){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<text.length(); i++) {
            sb.append(text.charAt(i));
            sb.append(text.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        DoubleChar dc = new DoubleChar();
        System.out.println(dc.doubleChar("The"));
        System.out.println(dc.doubleChar("AAbb"));
        System.out.println(dc.doubleChar("Hi-There"));
    }
}
