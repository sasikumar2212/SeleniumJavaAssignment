package javachallenge;

import java.util.Arrays;
/*
 * 
 * 
 * 
Java Problem (17/20)

You are given an integer array nums. The unique elements of an array are the elements that appear 
exactly once in the array.

Return the sum of all the unique elements of nums.

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

 * 
 * 
 */
public class Problem17_sum_of_all_unique_elements {

	public static void main(String[] args) {
		int nums[] = {1,2,3,2,1};
		int total = 0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			int count=0;
			for(int j=0;j<nums.length;j++) {
				if(nums[i] == nums[j]) {
					count++;
				}
			}
			if(count == 1) {
				total +=nums[i]; 
			}
		}
		System.out.println(total);
	}

}
