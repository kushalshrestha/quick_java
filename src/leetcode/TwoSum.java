/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,2,4], target = 6
Output: [1,2]

Input: nums = [3,3], target = 6
Output: [0,1]
*/

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));

        int[] nums1 = new int[]{3, 3};
        int target1 = 6;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            int valueToCheck = target - nums[currentIndex];
            if (map.containsKey(valueToCheck)) {
                return new int[]{map.get(valueToCheck), currentIndex};
            }
            map.put(nums[currentIndex], currentIndex);
        }
        return null;
    }
}
