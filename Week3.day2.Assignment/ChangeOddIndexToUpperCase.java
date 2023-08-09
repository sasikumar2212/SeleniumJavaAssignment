package week3.day1.collectionsprogram;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		
		char[] testStr = test.toCharArray();
		
		for(int i=0;i<testStr.length;i++) {
			if((i+1)%2 != 0) {
				System.out.print(Character.toUpperCase(testStr[i]));
			}else {
				System.out.print(testStr[i]);
			}
		}
	}

}
