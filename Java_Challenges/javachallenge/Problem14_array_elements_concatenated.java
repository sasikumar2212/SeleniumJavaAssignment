package javachallenge;
/*
 * Java Problem (14/20)

Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
 * 
 * 
 */

public class Problem14_array_elements_concatenated {

	public static void main(String[] args) {
		//String word1[] = {"ab", "c"};
		//String word2[] = {"a", "bc"};
		
		String word1[] = {"abc", "d", "defg"};
		String word2[] = {"abcddefg"};
		
				 
		String strword1 ="";
		for(int i=0;i<word1.length;i++) {
			strword1 +=word1[i];
		}
		System.out.println(strword1);
		
		String strword2 ="";
		for(int i=0;i<word2.length;i++) {
			strword2 +=word2[i];
		}
		System.out.println(strword2);
		
		if(strword1.equals(strword2)) {
			System.out.println("True");
		}else {
			System.out.println("Flase");
		}
	}

}
