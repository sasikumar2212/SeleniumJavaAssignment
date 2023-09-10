package javachallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Problem4_Majority_element {
	public static void main(String[] args) {
		
		int arr[] = {3,2,4,2,3,5,2,3,6,3};
		Arrays.sort(arr);
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>(); 
		
		for(int i=0;i<arr.length;i++) {
			//System.out.println("i loop "+arr[i]);
			int temp = 1;
			
			for(int j=0;j<arr.length;j++) {
				//System.out.println("j loop "+arr[j]);
				int count =0;
				if(arr[i] == arr[j]) {
					//System.out.println(arr[i]+" == "+arr[j]);
					count+=temp;
					//System.out.println(count +" "+ temp);
					map.put(arr[i], count);
					temp++;
					//break;
				}
				
			}
			
		}
		
		//System.out.println(map);
		Set<Integer> keys = map.keySet();
		for(int key:keys) {
			//System.out.println("Kye --"+key+"Value -- "+map.get(key));
			if(map.get(key)%2 == 0) {
				System.out.println(key +" is Majority of n/2 in the given numbers");
			}
		}
	}
}
