package I_ProblemSolving.I_ArraysAndHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Contains Duplicate
Solved 
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false
*/

public class I_ContainsDuplicate {
	
	/* 1. By Brute Force */
	public boolean hasDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	 /* 2. By Sorting */
	public boolean hasDuplicateBySorting(int[] nums) {
		Arrays.sort(nums);
		for (int i=1; i < nums.length; i++) {
			if (nums[i] == nums[i-1]) {
				return true;
			}
		}
		return false;
	}
	
	/*3. By Hash Set*/
	public boolean hasDuplicateByHashSet(int[] nums) {
		Set<Integer> seen = new HashSet<Integer>();
		for (int num: nums) {
			if (seen.contains(num)) {
				return true;
			}
			seen.add(num);
		}
		
		return false;
	}
	
	/* 4. By Hash Set Length */
	public boolean hasDuplicateByHashSetLength(int[] nums) {
		return Arrays.stream(nums).distinct().count() < nums.length;
	}
	
	// Test method
    public static void main(String[] args) {
    	I_ContainsDuplicate solution = new I_ContainsDuplicate();
    	int[] nums = {1, 2, 3, 3};
    	System.out.println(solution.hasDuplicate(nums)); //true
    	System.out.println(solution.hasDuplicateBySorting(nums));
    	System.out.println(solution.hasDuplicateByHashSet(nums));
    	System.out.println(solution.hasDuplicateByHashSetLength(nums));
        
    }
}
