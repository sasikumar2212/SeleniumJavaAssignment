package javachallenge;
/*
 * Java Problem (11/20)

Given a string s consisting of lowercase English letters, return the first letter to appear twice.

Note:

A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
s will contain at least one letter that appears twice.

Example 1:

Input: s = "abccbaacz"
Output: "c"
Explanation:
The letter 'a' appears on the indexes 0, 5 and 6.
The letter 'b' appears on the indexes 1 and 4.
The letter 'c' appears on the indexes 2, 3 and 7.
The letter 'z' appears on the index 8.
The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
Example 2:

Input: s = "abcdd"
Output: "d"
Explanation:
The only letter that appears twice is 'd' so we return 'd'.


 * 
 */
public class Problem11_first_letter_appear_twice {

	public static void main(String[] args) {
		String s = "aeebccbaacz";
		String firstChar = s.substring(0,1);
		String twice = " ";
		for(int i=0;i<s.length();i++) {
			//System.out.println("first char "+firstChar);
			//int count=0;
			
			String res = Character.toString(s.charAt(i));
			//System.out.println(firstChar +" ------ "+res);
			
			if(twice.equals(res)) {
				
				//System.out.println(twice+" twice equals res "+res);
				System.out.println(twice+" is the first letter to appear twice");
				break;
				
			}else {
				//System.out.println(twice+" twice not equals res "+res);
				twice = res;
			}
			
		}
	}

}
