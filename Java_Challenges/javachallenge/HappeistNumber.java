package javachallenge;

public class HappeistNumber {
	
	public static void main(String[] args) {
		int num = 20;
		double squ=num/2;
		double res=0;
		for(int i=0;i<num;i++) {
			System.out.println(i);
			res=squ;
			squ=(res+(num/res))/num;
		}
		System.out.println((int)res);
	}

}
