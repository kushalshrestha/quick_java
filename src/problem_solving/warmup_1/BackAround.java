/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_1;
/*
* Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt".
* The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
* */
public class BackAround {
    public String backAround(String text) {
        if (text.length() < 2 ) {
            return text;
        }
        String lastChar = text.substring(text.length() - 1);
        return lastChar + text + lastChar;
    }

    public static void main (String[] args) {
        BackAround ba = new BackAround();

        System.out.println(ba.backAround("cat"));
        System.out.println(ba.backAround("Hello"));
        System.out.println(ba.backAround("a"));
    }
}
