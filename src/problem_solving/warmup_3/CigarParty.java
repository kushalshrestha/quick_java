/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;
/**
 *
 When squirrels get together for a party, they like to have cigars.
 A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
 Unless it is the weekend, in which case there is no upper bound on the number of cigars.
 Return true if the party with the given values is successful, or false otherwise.


 cigarParty(30, false) → false
 cigarParty(50, false) → true
 cigarParty(70, true) → true
 * */
public class CigarParty {
    public boolean cigarParty(int a, boolean isWeekend){
        return (a >= 40 && a <=60 && !isWeekend) || (a >= 40 && isWeekend);
    }

    public static void main(String[] args){
        CigarParty cp = new CigarParty();

        System.out.println(cp.cigarParty(30, false));
        System.out.println(cp.cigarParty(50, false));
        System.out.println(cp.cigarParty(70, true));
    }
}
