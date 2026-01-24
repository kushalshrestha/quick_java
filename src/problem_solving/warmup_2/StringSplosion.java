/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_2;
/**
 *
 Given a non-empty string like "Code" return a string like "CCoCodCode".


 stringSplosion("Code") → "CCoCodCode"
 stringSplosion("abc") → "aababc"
 stringSplosion("ab") → "aab"
 * */
public class StringSplosion {
    public String stringSplosion(String text) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<text.length(); i++){
            String appendString = text.substring(0, i+1);
            sb.append(appendString);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringSplosion sp = new StringSplosion();

        System.out.println(sp.stringSplosion("Code"));
        System.out.println(sp.stringSplosion("abc"));
        System.out.println(sp.stringSplosion("ab"));
    }
}
