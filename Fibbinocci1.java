package Week1.day1.Assignment;

public class Fibbinocci1 {
	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		
		for(int i=0;i<=10;i++) {
			sum = firstNum+secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}
	}
}
