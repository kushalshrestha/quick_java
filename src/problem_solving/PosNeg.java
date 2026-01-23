/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving;
/*
*
Given 2 int values, return true if one is negative and one is positive.
* Except if the parameter "negative" is true, then return true only if both are negative.


posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
* */
public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative){
        return (a < 0 && b > 0) || (a > 0 && b < 0) || (negative && a < 0 && b < 0);
    }

    public static void main (String[] args) {
        PosNeg pn = new PosNeg();

        System.out.println(pn.posNeg(1, -1, false));
        System.out.println(pn.posNeg(-1, 1, false));
        System.out.println(pn.posNeg(-4, -5, true));
    }
}
