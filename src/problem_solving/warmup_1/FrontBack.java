/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_1;

/*
* Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
* */

public class FrontBack {
    public String frontBack(String text) {
        int length = text.length();
        if (length == 1)
            return text;
        if (length == 2)
            return text.charAt(length - 1) + "" + text.charAt(0);
        return text.charAt(length - 1) + text.substring(1, length - 1) + text.charAt(0);
    }

    public static void main(String[] args) {
        FrontBack fb = new FrontBack();
        System.out.println(fb.frontBack("code"));
        System.out.println(fb.frontBack("a"));
        System.out.println(fb.frontBack("ab"));
    }
}
