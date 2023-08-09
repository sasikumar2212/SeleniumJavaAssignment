package week3.day1.collectionsprogram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String pp = "PayPal India";
		
		char[] charpp = pp.toCharArray();
		
		Set charSet = new HashSet();
		Set dupCharSet = new HashSet();
		
		for(char cpp:charpp) {
			//System.out.println(cpp);
			//charSet.add(cpp);
			
			if(!charSet.add(cpp)) {
				dupCharSet.add(cpp);
			}
		}
		System.out.println(charSet);
		System.out.println(dupCharSet);
	}

}
