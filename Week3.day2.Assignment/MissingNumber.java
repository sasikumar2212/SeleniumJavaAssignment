package week3.day1.collectionsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] num = { 1, 3, 2, 5, 7, 2, 3, 7, 5, 3, 2, 9, };
		Set<Integer> setNum = new TreeSet();

		for (int i = 0; i < num.length; i++) {

			setNum.add(num[i]);
						
		}
		System.out.println(setNum);
		List<Integer> listNum= new ArrayList<Integer>(setNum);
		
		for(int j =0;j<listNum.size();j++) {
			//System.out.println(j);
			//System.out.println(listNum.get(j)+" === "+(j+1));
			//System.out.println(listNum.get(j)+" === "+listNum.contains(j + 1));
			if (!listNum.get(j).equals(j + 1) && !listNum.contains(j + 1)  ) {
				System.out.println("The Missing Number is: "+ (j+1));
				
			}
		}
	}

}
