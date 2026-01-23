/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

/*The parameter weekday is true if it is a weekday,
and the parameter vacation is true if we are on vacation.
 We sleep in if it is not a weekday or we're on vacation.
 Return true if we sleep in.


sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
*/
package problem_solving;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        boolean IsSleepIn = false;
        if (!weekday || vacation)
            IsSleepIn = true;
        return IsSleepIn;
    }

    public boolean sleepInOptimized(boolean weekday, boolean vacation){
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        SleepIn s = new SleepIn();
        System.out.println(s.sleepIn(false, false));
        System.out.println(s.sleepIn(true, false));
        System.out.println(s.sleepIn(false, true));


        System.out.println(s.sleepInOptimized(false, false));
        System.out.println(s.sleepInOptimized(true, false));
        System.out.println(s.sleepInOptimized(false, true));
    }
}
