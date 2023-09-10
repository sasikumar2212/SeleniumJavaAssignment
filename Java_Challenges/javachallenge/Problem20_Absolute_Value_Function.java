package javachallenge;

import java.util.LinkedHashSet;
import java.util.Set;


public class Problem20_Absolute_Value_Function {
/*
 * 
 * Java Problem (20/20)

Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

The distance between two indices i and j is abs(i - j), where abs is the absolute value function. 

Example 1:

Input: s = "aaab", c = "b"
Output: [3,2,1,0]
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		String  s = "aaab", 
				c = "b";
		
		
		int arrI = 0;
		Set<Integer> arrInt = new LinkedHashSet<Integer>(arrI);
		
		char arrS[] = s.toCharArray();
		//System.out.println(arrS.length);
		//System.out.println(s.indexOf(c));
		int j=1;
		for(int i=arrS.length;i>0;i--) {
			//System.out.println(i+" ==== "+j);
			//System.out.print(i-j);
			int abs = (i-j);
			arrInt.add(abs);
			
		}
		//System.out.println(arrI);
		
		System.out.println(arrInt);
	}

}
