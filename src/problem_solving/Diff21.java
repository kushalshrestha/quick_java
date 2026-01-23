/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving;

/*
*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
* */
public class Diff21 {
    public int diff21(int n) {
        int difference = Math.abs(n - 21);
        return n > 21 ? 2 * difference : difference;
    }

    public static void main(String[] args) {
        Diff21 d = new Diff21();

        System.out.println(d.diff21(19));
        System.out.println(d.diff21(10));
        System.out.println(d.diff21(21));
    }
}
