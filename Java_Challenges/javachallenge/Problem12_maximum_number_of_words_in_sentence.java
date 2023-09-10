package javachallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 
 * Java Problem (12/20)

A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.

 

Example 1:

Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
Example 2:

Input: sentences = ["please wait", "continue to fight", "continue to win"]
Output: 3
Explanation: It is possible that multiple sentences contain the same number of words. 
In this example, the second and third sentences (underlined) have the same number of words.
 * 
 * 
 */

public class Problem12_maximum_number_of_words_in_sentence {

	public static void main(String[] args) {
		String sentences[] = { "please wait", "continue to fight", "continue to win"};

		//System.out.println(sentences.length);
		List<Integer> senLength =new  ArrayList<Integer>();
		for(String sentence:sentences) {
			String sen[] = sentence.split(" ");
			
			//System.out.println(sen.length);
			senLength.add(sen.length);
			
			
		}
		//System.out.println(senLength);
		System.out.println("the maximum number of words in a single sentence is "+Collections.max(senLength));
	}
	

}
