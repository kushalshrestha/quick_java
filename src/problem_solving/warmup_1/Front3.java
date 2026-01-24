/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_1;

/*
* Given a string, we'll say that the front is the first 3 chars of the string.
* If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
* */
public class Front3 {
    public String front3(String text) {
        String finalText = "";
        if (text.length() < 3) {
            finalText = text;
        } else {
            finalText = text.substring(0, 3);
        }
        return finalText + finalText + finalText;
    }

    public static void main(String[] args) {
        Front3 f3 = new Front3();

        System.out.println(f3.front3("Java"));
        System.out.println(f3.front3("Chocolate"));
        System.out.println(f3.front3("abc"));
        System.out.println(f3.front3("a"));
    }
}
