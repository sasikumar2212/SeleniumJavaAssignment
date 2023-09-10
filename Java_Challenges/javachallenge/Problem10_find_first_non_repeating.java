package javachallenge;

public class Problem10_find_first_non_repeating {

	public static void main(String[] args) {
		String s = "loveleetcode";
		String s1="";
		for(int i=0;i<s.length();i++) {
			//System.out.println(i);
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j)) {
					count++;
					
				}
				
			}
			if(count == 1) {
				//System.out.println(s.charAt(i));
				s1+=s.charAt(i);
			}
		}
		//System.out.println(s1);
		char firstNonRep;
		if(!s1.isEmpty()) {
			firstNonRep = s1.charAt(0);
			
			System.out.println(s.indexOf(firstNonRep));
		}else {
			System.out.println(-1);
		}
		
	}

}


