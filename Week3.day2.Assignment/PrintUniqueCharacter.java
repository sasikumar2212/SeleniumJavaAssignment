package week3.day1.collectionsprogram;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "SSassikumar";
		char[] arrName = name.toCharArray();
		
		Set setName = new HashSet();
		for(char an:arrName) {
			System.out.println(an);
			
			if(!setName.contains(an)) {
				setName.add(an);
			}
		}
		System.out.println(setName);
	}

}
