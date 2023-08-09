package week3.day1.collectionsprogram;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		
		String[] testSplit = test.split(" ");
		
		for(int i=0;i<testSplit.length;i++) {
			if((i+1)%2==0) {
				//System.out.println("I am an even word: "+testSplit[i]);
				char[] charArr = testSplit[i].toCharArray();
				String rev = "";
				for(int j=charArr.length-1;j>=0;j--) {
					//System.out.println(charArr[j]);
					rev = Character.toString(charArr[j]);
					System.out.print(rev);
							
				}
				System.out.print(" ");
			}else {
				System.out.print(testSplit[i]+" ");
			}
			
		}
		//System.out.println(rev);
	}	

}
