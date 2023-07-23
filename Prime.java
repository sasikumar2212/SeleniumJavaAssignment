package Week1.day1.Assignment;

public class Prime {
	public int isPrime(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0){
				count++;
			}
		}

		System.out.println(count);
		return count;

	}

	public static void main(String[] args) {
		Prime s = new Prime();
		s.isPrime(10);

	}

}
