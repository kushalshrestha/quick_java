package I_ProblemSolving.I_ArraysAndHashing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/*
 * Valid Anagram
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters.

 */

public class II_ValidAnagram {
	public boolean isAnagramBySorting(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		char[] sSort = s.toCharArray();
		char[] tSort = t.toCharArray();
		Arrays.sort(sSort);
		Arrays.sort(tSort);
		return Arrays.equals(sSort, tSort);
		
	}
	
	public boolean isAnagramByHashTable(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		HashMap<Character, Integer> countS = new HashMap<>();
		HashMap<Character, Integer> countT = new HashMap<>();
		for (int i=0; i < s.length(); i++) {
			countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
			countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
		}
		
		return countS.equals(countT);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		II_ValidAnagram valid_anagram = new II_ValidAnagram();
		String s = "racecar";
		String t = "carrace";
		
		System.out.println(valid_anagram.isAnagramBySorting(s, t));
		System.out.println(valid_anagram.isAnagramByHashTable(s, t));

	}
}
