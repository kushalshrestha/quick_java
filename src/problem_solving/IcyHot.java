/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving;

/*
*
Given two temperatures, return true if one is less than 0 and the other is greater than 100.


icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
* */
public class IcyHot {
    public boolean icyHot(int a, int b) {
        return (a < 0 && b > 100) || (a > 100 || b < 0);
    }

    public static void main(String[] args) {
        IcyHot ih = new IcyHot();

        System.out.println(ih.icyHot(120, -1));
        System.out.println(ih.icyHot(-1, 120));
        System.out.println(ih.icyHot(2, 120));
    }
}
