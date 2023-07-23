package Week1.day2.Assignment;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int arrlen = arr.length;
				
		for(int a=0;a<arrlen-1;a++) {
			for(int b=a+1;b<arrlen;b++) {
				if(arr[a] == arr[b]) {
					System.out.println(arr[a]);
				}
			}
		}
	}

}
