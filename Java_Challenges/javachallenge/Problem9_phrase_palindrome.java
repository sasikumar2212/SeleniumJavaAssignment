package javachallenge;


/*
 * 
 * Java Challenge (9/20)

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 * 
 */
public class Problem9_phrase_palindrome {

	public static void main(String[] args) {
		
		String s = " ";
		
		s = s.toLowerCase();
		System.out.println(s);
		s = s.replaceAll("[,: ]", "");
		String str = s.concat(" ").trim();
		
		String res = "";
		for(int i=str.length()-1;i>=0;i--) {
			//System.out.println(i);
			char rev = str.charAt(i); 
			res = res+rev;
		}
		String res1  = res.replace("[^a-z]", " ").trim();
		
		if(str.equals(res1)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		
	}
}
