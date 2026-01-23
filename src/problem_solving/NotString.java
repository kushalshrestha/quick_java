/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving;

/*
*
Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
*
* */
public class NotString {
    public String notString(String text) {
        if (text.length() >= 3 && text.substring(0,3).equals("not")) {
            return text;
        } else {
            return "not " + text;
        }
    }

    public String notStringOptimized(String text) {
        if (text.startsWith("not")) {
            return text;
        } else {
            return "not " + text;
        }
    }

    public static void main (String[] args){
        NotString ns = new NotString();

        System.out.println(ns.notString("candy"));
        System.out.println(ns.notString("x"));
        System.out.println(ns.notString("not bad"));

        System.out.println(ns.notStringOptimized("candy"));
        System.out.println(ns.notStringOptimized("x"));
        System.out.println(ns.notStringOptimized("not bad"));
    }
}
