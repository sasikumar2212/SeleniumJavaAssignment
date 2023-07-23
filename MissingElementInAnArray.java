package Week1.day2.Assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		//input array
		int[] arr = {1,2,3,4,7,6,8};
		//Shore the input array
		Arrays.sort(arr);
		//loop through array
		for(int w=0;w<arr.length;w++) {
			if(arr[w]!= w+1) {
				System.out.println(w+1);
				break;
			}
		}
		
		

	}

}
