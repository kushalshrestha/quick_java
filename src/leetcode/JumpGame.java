/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package leetcode;

import java.util.HashMap;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println("LeetCode Status : NOT COMPLETE");
        int[] nums = new int[]{5, 4, 0, 2, 0, 1, 0, 1, 0};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        HashMap<Integer, Integer> traceMap = new HashMap<>();
        int recentNonZero = nums[0];
        int consecutiveZero = 0;
        int maxJumpPossible = nums[0];
        if (nums.length == 1) {
            return true;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int nextJump = i + nums[i];
            int target = nums.length - 1;

            if (nums[i] == 0) {
                consecutiveZero = consecutiveZero + 1;
                System.out.println(consecutiveZero);
                System.out.println(recentNonZero);
                System.out.println(i);
                if ((traceMap.isEmpty() || recentNonZero == consecutiveZero) && consecutiveZero >= maxJumpPossible) {
                    System.out.println("BREAK1");
                    return false;
                }
            } else {
                recentNonZero = nums[i];
            }
            if (traceMap.containsKey(nums[i]) && i == traceMap.get(nums[i]

            )) {
                System.out.println("TRUE2");
                return true;
            } else {
                int remaining = (target - 1) - nums[i]; // x is required and perfectly could be in x position
                traceMap.put(remaining, i);
            }

            if (nextJump >= target) {
                System.out.println("i value : " + i);
                System.out.println("NEXTJUMP: " + nextJump);
                System.out.println("TARGET: " + target);
                System.out.println("TRUE1");
                return true;
            }
        }
        return false;
    }

//    public static boolean canJump(int[] nums) {
//        boolean canJump = false;
//        HashMap<Integer, Integer> traceMap = new HashMap<>();
//
//        if (nums.length == 1) {
//            return true;
//        }
//        for (int i = nums.length - 2; i >= 0; i--) {
//            int rightSide = (nums.length - 2) - i;
//            int leftSide = i;
//
//
//            if (nums[i] >= rightSide + 1) {
//                System.out.println("TRUE CONDITION : " + nums[i] + " | " + (rightSide + 1));
//                traceMap.put(nums[i], i);
//                canJump = true;
//            }
////            System.out.println("Index : " + i + " | Value : " + nums[i] + " | no. of positions on right : " + rightSide + " | no. of positions on left : " + leftSide);
//        }
//
//        for (Map.Entry<Integer, Integer> entry : traceMap.entrySet()) {
//            Integer key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println("Key=" + key + ", Value=" + value);
//        }
//
//        return canJump;
//    }
}
