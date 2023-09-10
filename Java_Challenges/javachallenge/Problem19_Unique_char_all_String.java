package javachallenge;

import java.util.LinkedHashSet;
import java.util.Set;

public class Problem19_Unique_char_all_String {
/*
 * 
 * 
 * 
Java Problem (19/20)

Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.
 
Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]
 * 
 * 
 * 
 * 
 */
	
	public static void main(String[] args) {
		String words[] = {"bella","label","roller"};
		String newWord[] = {};
		String uw = "";
		char uwCharArray[] = null;
		//List<String> uniqCharList = new ArrayList<String>();
		Set<String> uniqCharList = new LinkedHashSet<String>();
		for(int i=0;i<words.length;i++) {
			//System.out.println(words[i]);
			newWord = words[i].split("");
	
		
		
		for(int a=0;a<newWord.length;a++) {
			//System.out.println("word char " +newWord[a]);
			int count=0;
			for(int b=0;b<words.length;b++) {
				if(words[b].contains(newWord[a])) {
					count++;
					//System.out.println("Word "+words[b]+"  Char "+newWord[a]);
				}
			}
			//if(count == 3 && !uniqCharList.contains(newWord[a])) {
			if(count == 3) {
				uniqCharList.add(newWord[a]);
				//uw +=newWord[a];
				
			}
			//uwCharArray = uw.toCharArray();
			//Arrays.sort(uwCharArray);
			
		}
		}
		System.out.println(uniqCharList);
	}

}
