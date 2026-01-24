/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving;
/*
*
Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
* */
public class StartHi {
    public boolean startHi(String text) {
            return text.startsWith("hi");
    }

    public static void main (String[] args) {
        StartHi sh = new StartHi();

        System.out.println(sh.startHi("hi there"));
        System.out.println(sh.startHi("hi"));
        System.out.println(sh.startHi("hello hi"));
    }
}
