/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;

/**
 *
 Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.


 blackjack(19, 21) → 21
 blackjack(21, 19) → 21
 blackjack(19, 22) → 19
 */
public class BlackJack {
    public int blackjack(int a, int b){
        if (a > 21) a = 0;
        if (b > 21) b = 0;
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        BlackJack bj = new BlackJack();

        System.out.println(bj.blackjack(19, 21));
        System.out.println(bj.blackjack(21, 19));
        System.out.println(bj.blackjack(19, 22));
    }
}
