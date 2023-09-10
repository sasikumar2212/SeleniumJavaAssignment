package javachallenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindSingleElementInArray {

	public static void main(String[] args) {
		int nums[] = {4,1,2,1,2,5};
		//Arrays.sort(nums);
		int count=0;
		int res = 0;
		for(int i=0;i<nums.length;i++) {
			res = 0;
			count = nums[i];
			for(int j=0;j<nums.length;j++) {
				
				if(nums[j] == count  &&  (j!=i)) {
					res=1;
					
				}
			}
			if(res == 0) {
				System.out.println(count);
			}
			
		}
		//System.out.println(count);
	}

}
