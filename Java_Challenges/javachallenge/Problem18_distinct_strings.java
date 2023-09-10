package javachallenge;
/*
 * Java Problem (18/20)

A distinct string is a string that is present only once in an array.

Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

Note that the strings are considered in the order in which they appear in the array.

 

Example 1:

Input: arr = ["d","b","c","b","c","a"], k = 2
Output: "a"
Explanation:
The only distinct strings in arr are "d" and "a".
"d" appears 1st, so it is the 1st distinct string.
"a" appears 2nd, so it is the 2nd distinct string.
Since k == 2, "a" is returned. 
Example 2:

Input: arr = ["aaa","aa","a"], k = 1
Output: "aaa"
Explanation:
All strings in arr are distinct, so the 1st string "aaa" is returned.
Example 3:

Input: arr = ["a","b","a"], k = 3
Output: ""
 * 
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Problem18_distinct_strings {

	public static void main(String[] args) {
		String arr[] = {"aaa","aa","a"};
		HashMap<String,Integer> map = new LinkedHashMap<String, Integer>();
		//Arrays.sort(arr);
		int k = 1;
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				//System.out.println(arr[i] +"!="+ arr[j]);
				if(arr[i] == arr[j]) {
					count++;
					//map.put(arr[i], count);
				}
			}
			if(count == 1) {
				map.put(arr[i], count);
			}
		}
		//System.out.println(map);
		List<String> l = new ArrayList<String>(map.keySet());
		//System.out.println(l.size());
		if(l.size() >= k) {
			System.out.println(l.get(k-1));
		}else {
			System.out.println("");
		}
		
		
	}

}
