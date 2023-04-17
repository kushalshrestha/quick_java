/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Given an integer array nums, return all the triplets
    [nums[i], nums[j], nums[k]]
such that
    i != j,
    i != k,
    and j != k,
    and nums[i] + nums[j] + nums[k] == 0.

Example:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
*/
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        threeSum(nums);


    }

    public static List<List<Integer>> threeSum(int[] nums) {
        return null;
    }
}
