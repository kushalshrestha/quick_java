/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_1;

/*
* We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
*  We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.


parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
* */

public class ParrotTrouble {
    public boolean parrotTrouble (boolean isTalking, int hour){
        return isTalking && (hour < 7 || hour > 20);
    }

    public static void main(String[] args) {
        ParrotTrouble pt = new ParrotTrouble();

        System.out.println(pt.parrotTrouble(true, 6));
        System.out.println(pt.parrotTrouble(true, 7));
        System.out.println(pt.parrotTrouble(false, 6));
    }
}
