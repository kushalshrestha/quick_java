/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package leetcode;
/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */


import java.util.HashMap;

public class StepMatch {
    public static void main(String[] args) {

//        System.out.println(canJump(0,2,5,3));
        System.out.println(canJump(21, 6, 47, 3));
        System.out.println(canJump(0,3, 4, 2));
    }

    public static String canJump(
            int x1,
            int v1,
            int x2,
            int v2
    ) {

        if (v1 <= v2) {
            return "NO"; // Kangaroo 1 is slower or has the same speed as Kangaroo 2, they will never meet
        }

        int times = Math.abs((x2 - x1) / (v1 - v2));

        if (Math.abs((x2 - x1) % (v1 - v2)) == 0 && times < 10000) {
            return "YES"; // The distance difference is divisible by the speed difference, they will meet at some point
        } else {
            return "NO"; // They will never meet
        }
    }

}
