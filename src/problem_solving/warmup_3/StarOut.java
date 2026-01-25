/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;

/**
 * Return a version of the given string, where for every star (*) in the string the star and the chars
 * immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 *
 *
 * starOut("ab*cd") → "ad"
 * starOut("ab**cd") → "ad"
 * starOut("sm*eilly") → "silly"
 * */
public class StarOut {
    public String starOut(String text) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<text.length(); i++) {
            char c = text.charAt(i);
            boolean leftStar = (i > 0 && text.charAt(i-1) == '*');
            boolean rightStar = (i < text.length() - 1 && text.charAt(i+1) == '*');

            if (c != '*' && !leftStar && !rightStar) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    /**
     * Explanation:
      .? → matches any char before the star (optional)
      \\*+ → matches one or more stars
      .? → matches any char after the star (optional)
      This removes the star and neighbors in one go.
     */
    public String starOutOptimized(String text) {
        return text.replaceAll(".?\\*+.?", "");
    }

    public static void main(String[] args) {
        StarOut so = new StarOut();

        System.out.println(so.starOut("ab*cd"));
        System.out.println(so.starOut("ab**cd"));
        System.out.println(so.starOut("sm*eilly"));

        System.out.println(so.starOutOptimized("ab*cd"));
        System.out.println(so.starOutOptimized("ab**cd"));
        System.out.println(so.starOutOptimized("sm*eilly"));
    }
}
