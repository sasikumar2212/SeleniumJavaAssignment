package Week1.day1.Assignment;

public class ReverseOrder {

	public static String reverseString(String input) {

		// Write your code here
		//System.out.println(input.length());
		char c;
		String rev = "";
		for (int i = input.length()-1; i>=0; i--) {
		//for(int i--;i>0;i=input.length()) {
			c = input.charAt(i);
			rev = rev+c;
		}
		System.out.println(rev);
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Sasikumar";
		//System.out.println(a.charAt(0));
		ReverseOrder RO = new ReverseOrder();
		RO.reverseString(a);
	}

}
