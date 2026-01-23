/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving;
/*
* Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
* */
public class Makes10 {
    public boolean makes10(int a, int b){
        return (a == 10|| b == 10) || (a+b) == 10;
    }

    public static void main(String[] args) {
        Makes10 m = new Makes10();

        System.out.println(m.makes10(9, 10));
        System.out.println(m.makes10(9, 9));
        System.out.println(m.makes10(1, 9));
    }
}
