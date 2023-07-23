package Week1.day2.Assignment;

public class FindSecondLargest1 {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int res = 0;
		for(int p=0;p<data.length;p++) {
			for(int q=p+1;q<data.length;q++) {
				if(data[p] > data[q]) {
					res = data[p];
					data[p]=data[q];
					data[q]=res;
					
				}
			}
		}
		System.out.println();
		for(int r=0;r<data.length;r++) {
			System.out.print(data[r]+",");
		}

	}

}
