/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_1;
/*
*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.


in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
* */
public class In1020 {
    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public static void main (String[] args) {
        In1020 i = new In1020();

        System.out.println(i.in1020(12, 99));
        System.out.println(i.in1020(21, 12));
        System.out.println(i.in1020(8, 99));
    }
}
