/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package leetcode;

public class AmericanFootball {

    public static int countWaysToScore(int score) {
        if (score < 0) {
            return 0;
        }

        int[] dp = new int[score + 1];
        dp[0] = 1; // There's one way to achieve 0 score (by not scoring)

        int[] scoringOptions = {2, 3, 6}; // Scoring options: Safety, Field Goal, Touchdown

        for (int option : scoringOptions) {
            for (int i = option; i <= score; i++) {
                dp[i] += dp[i - option];
            }
        }


        // Handling extra points for touchdowns
        for (int i = 6; i <= score; i += 6) {
            for (int j = 1; j <= 2; j++) {
                if (i + j <= score) {
                    dp[i + j] += dp[i];
                }
            }
        }

        return dp[score];
    }

    public static void main(String[] args) {
        System.out.println(countWaysToScore(6)); // Output: 3
        System.out.println(countWaysToScore(5)); // Output: 2
        System.out.println(countWaysToScore(10)); // Output: 14
    }
}

