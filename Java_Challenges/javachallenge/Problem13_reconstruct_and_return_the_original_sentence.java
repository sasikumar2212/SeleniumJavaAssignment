package javachallenge;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * 
 * 
 * Java Problem (13/20)
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
Example 2:

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
 * 
 */


public class Problem13_reconstruct_and_return_the_original_sentence {

	public static void main(String[] args) {
		String s = "Myself2 Me1 I4 and3";
		
		String strArray[] = s.split(" ");
		
		//System.out.println(strArray.length);
		System.out.println("Given String array is "+Arrays.toString(strArray));
		String intArray[] = new String[strArray.length];
		
		//intArray = Arrays.stream(strArray).mapToInt(Integer::parseInt).toArray();
		for(int i=0;i<strArray.length;i++) {
			//System.out.println(strArray[i]);
			String num = strArray[i].replaceAll("[^0-9]"," ");
			String str = strArray[i].replaceAll("[^a-zA-Z]", " ");
			String newStr = num.trim()+str.trim();
			//System.out.println(newStr);
			intArray[i] = newStr;
		}
		Arrays.sort(intArray);
		String textArray[] = new String[intArray.length];
		for(int i=0;i<intArray.length;i++) {
			String txtarr = intArray[i].replaceAll("[^a-zA-Z]", " ");
			//System.out.println(txtarr.trim());
			textArray[i] = txtarr.trim();
		}
		
		System.out.println("Reconstructed original Array is "+Arrays.toString(textArray));
		
	}

}
