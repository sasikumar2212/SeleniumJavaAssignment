package Week1.day1.Assignment;

public class ReverseOrder1 {
	public static String reverseString(String input) {

		// Write your code here
		System.out.println(input.length());
		char ch;
		String rev="";
		for (int i =0; i<input.length(); i++) {
			ch = input.charAt(i);
			rev = ch+rev;
		}
		System.out.println(rev);
		
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Sasikumar";
		//System.out.println(a.charAt(0));
		ReverseOrder1 RO = new ReverseOrder1();
		RO.reverseString(a);
	}

}
