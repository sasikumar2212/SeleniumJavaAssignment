package Week1.day1.Assignment;

public class Fibbinocci {

	private static int add;

	public int add(int fn, int sn) {
		//System.out.println(fn+"  "+sn);
		int sum = fn+sn;
		System.out.println(sum);
		return sum;
	}
	
	public static void main(String[] args) {
		
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		Fibbinocci fn = new Fibbinocci();
		
		for(int i=0;i<=10;i++) {
			
			
			int res = fn.add(firstNum, secNum);
			firstNum = secNum;
			secNum = res;
		}
			
			
	}
}
