package javachallenge;

import java.util.ArrayList;
import java.util.List;

import org.checkerframework.checker.index.qual.LengthOf;

/*
 * 
 * 
 * Java Challenge (8/20)

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 */


public class Problem8_length_of_the_last_word_substring {

	public static void main(String[] args) {
		String words = "luffy is still joyboy";
		
		String word = words.trim();
		String lastWord = word.substring(word.lastIndexOf(" ")+1);
		System.out.println(lastWord.length());
		
	}

}
