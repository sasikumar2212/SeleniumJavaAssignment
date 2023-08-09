package week3.day1.collectionsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> setInt = new TreeSet();
		
		for(int i=0;i<data.length;i++) {
			
			setInt.add(data[i]);
		}
		//System.out.println(setInt);
		List<Integer> listInt = new ArrayList<Integer>(setInt);
		System.out.println(listInt);
		System.out.println(listInt.get(listInt.size()-2));
		
	}

	
}
