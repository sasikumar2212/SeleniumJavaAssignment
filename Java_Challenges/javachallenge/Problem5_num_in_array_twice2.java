package javachallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem5_num_in_array_twice2 {
/*
 * 
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:
 */
	
	public static boolean calcu(int nums[]) {
		//int nums[] = {1,2,3,1};
		//System.out.println(nums);
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>(); 
		//Arrays.sort(nums);
		int temp =0;
		for(int i=0;i<nums.length;i++) {
			int count=0;
			for(int j=0;j<nums.length;j++) {
			
				if(nums[i] == nums[j]) {
					
					count++;
					if(count > 1) {
					
						temp +=count;
						map.put(nums[i], count);
						
					}
					
				}
				
			}
			
			
		}
		//System.out.println(map);
		List<Integer> key = new ArrayList<Integer>(map.keySet());
		List<Integer> value = new ArrayList<Integer>(map.values());
		//System.out.println(value);
		if(!value.isEmpty()) {
		
			if(value.get(0) > 1) {
				//System.out.println("Duplication founds "+ key);
				return true;
			}else {		
				return false;
			}
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
	
		int nums[] = {1,2,3,5,6,7,8,4};
		System.out.println(calcu(nums));
		
		
	}
}
