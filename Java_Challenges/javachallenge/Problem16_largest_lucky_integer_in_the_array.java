package javachallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;

public class Problem16_largest_lucky_integer_in_the_array {

	private static final int Integer = 0;

	public static void main(String[] args) {
		int arr[] = {2,2,2,3,3};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					map.put(arr[i], count);
				}
			}
			
		}
		System.out.println(map);
		
		int maxValue = 0;
        int maxKey = 0;
        // Iterate through the map entries
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        
     // Print the result
        
		
		/*
		 * List<Integer> mval =new ArrayList<Integer>(map.values()); List<Integer> mkey
		 * =new ArrayList<Integer>(map.keySet()); Collections.checkedMap(map, null,
		 * null); System.out.println(mkey +" ===== "+mval);
		 */
		if(maxKey == maxValue) {
			System.out.println("Key with the largest value: " + maxKey);
	        System.out.println("Largest value: " + maxValue);
		}else {
			System.out.println(-1);
		}
		
		
	}

}
