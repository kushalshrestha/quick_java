/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

/*
* We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
* We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false

* */

package problem_solving.warmup_1;


public class MonkeyTrouble {
    public boolean monkeyTrouble(
            boolean aSmile,
            boolean bSmile
    ) {
        return ((aSmile && bSmile) ||(!aSmile && !bSmile));
    }

    public boolean monkeyTroubleOptimized (boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public static void main(String[] args) {
        MonkeyTrouble mt = new MonkeyTrouble();
        System.out.println(mt.monkeyTrouble(true, true));
        System.out.println(mt.monkeyTrouble(false, false));
        System.out.println(mt.monkeyTrouble(true, false));

        System.out.println(mt.monkeyTroubleOptimized(true, true));
        System.out.println(mt.monkeyTroubleOptimized(false, false));
        System.out.println(mt.monkeyTroubleOptimized(true, false));
    }
}
