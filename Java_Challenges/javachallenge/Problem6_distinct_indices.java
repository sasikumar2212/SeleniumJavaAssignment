package javachallenge;
/*
 * Java Problem (6/20)

Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */

public class Problem6_distinct_indices {
	public static void main(String[] args) {
		int nums[]= {1,2,3,1};
		int k=3;
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				//System.out.println((i-j)+"<="+k);
				if(nums[i] == nums[j] && (i-j)<=k) {
					//System.out.println("num i "+nums[i]+" num j "+nums[j]);
					System.out.println("True");
				}else {
					System.out.println("false");
				}
			}
		}
	}
}
