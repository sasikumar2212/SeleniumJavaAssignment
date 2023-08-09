package week3.day1.collectionsprogram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] arrText = text.split(" ");
		
		Set<String> uniText = new LinkedHashSet();
		
		for(String at:arrText) {
			uniText.add(at);
		}
		System.out.println(uniText);
		System.out.println();
		List<String> uniString = new ArrayList<String>(uniText);
		//System.out.println(uniString);
		for(String us:uniString) {
			System.out.print(us);
			System.out.print(" ");
		}
		
	}

}
