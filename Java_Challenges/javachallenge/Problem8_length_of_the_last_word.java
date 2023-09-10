package javachallenge;

import java.util.ArrayList;
import java.util.List;

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


public class Problem8_length_of_the_last_word {

	public static void main(String[] args) {
		String words = "fly me   to   the moon  ";
		
		String[] word = words.split(" ");
		
		System.out.println(word[word.length - 1]);
		String lastWord=word[word.length - 1];
		
		/*
		 * List<String> wordList = new ArrayList<String>(); for(String w:word) {
		 * wordList.add(w); } System.out.println(wordList); String wordChar =
		 * wordList.get(wordList.size()-1); System.out.println(wordChar);
		 */
		System.out.println(lastWord.length());
		
	}

}
