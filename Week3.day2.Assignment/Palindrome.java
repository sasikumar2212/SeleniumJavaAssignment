package week3.day1.collectionsprogram;

public class Palindrome {

	public static void main(String[] args) {
		String palin = "mada8m";
		String rev = "";
		
		for(int i=palin.length()-1;i>=0;i--) {
			//System.out.println(palin.charAt(i));
			rev += Character.toString(palin.charAt(i));
			
		}
		System.out.println(rev);
		if(palin.equals(rev)) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given String is Not a Palindrome");
		}
	}

}
