package javachallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Java Problem (7/20)

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 */


public class Problem7_number_of_occurrences {

	public static void main(String[] args) {
		int arr[] = {1,2,2,1,1,3};
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					hs.put(arr[i], count);
				}
			}
		}
		System.out.println(hs);
		List<Integer> ls = new ArrayList<Integer>(hs.values());
		System.out.println(ls);
		int count = 0;
		for(int k=0;k<ls.size();k++) {
			int temp=0;
			for(int l=0;l<ls.size();l++) {
				if(ls.get(k) == ls.get(l)) {
					temp++;
					
					
				}
			}
			count = temp;
			
		}
		System.out.println(count);
		

	}

}
