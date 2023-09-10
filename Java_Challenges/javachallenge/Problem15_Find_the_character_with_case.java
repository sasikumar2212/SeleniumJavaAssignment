package javachallenge;

/*
 * 
 * Java Problem (15/20)

You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0

 * 
 * 
 * 
 */
public class Problem15_Find_the_character_with_case {

	public static void main(String[] args) {
		String jewels = "z";
		String stones = "ZZ";
		int Total = 0;
		String arrJewels[] = jewels.split("");
		//System.out.println(arrJewels.length);
		String arrStones[] = stones.split("");
		//System.out.println(arrStones.length);
		for(int i=0;i<arrJewels.length;i++) {
			int count=0;
			for(int j=0;j<arrStones.length;j++) {
				//if(jewels.toLowerCase().charAt(i) == stones.toLowerCase().charAt(j)) {
				//char cjewels = jewels.charAt(i);
				//char cstones = stones.charAt(j);
				if(arrJewels[i].equals(arrStones[j])) {
					//System.out.println(arrStones[j]);
					count++;
				}
			}
			Total = Total+ count;
			
		}
		System.out.println(Total);
	}

}
