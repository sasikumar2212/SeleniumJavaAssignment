package week3.day1.collectionsprogram;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] companys = {"Google","Microsoft","TestLeaf","Maverick"};
		
		int companyCount = companys.length;
		System.out.println(companyCount);
		Arrays.sort(companys);
		
		for(int i=companys.length-1;i>=0;i--) {
			System.out.print(companys[i]+",");
		}
	}

}
