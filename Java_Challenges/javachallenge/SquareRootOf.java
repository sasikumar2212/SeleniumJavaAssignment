package javachallenge;

public class SquareRootOf {

	public static void main(String[] args) {
		int num = 50;
		double squ = num/2;
		double res = 0;
		for(int i=0;i<squ;i++) {
			res=squ;
			squ = (res+(num/res))/2;
						
		}
		System.out.println((int)res);
	}

}
