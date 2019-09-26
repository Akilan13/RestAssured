package Amazon;

import java.util.Arrays;

public class Anangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String S1 = "Silent";
			
	String S2 = "Listens";
	
	char c[] = S1.toLowerCase().toCharArray(); 
	char d[] = S2.toLowerCase().toCharArray(); 
	
	Arrays.sort(c);
	Arrays.sort(d);
	
	if (Arrays.equals(c, d)) {
		
		System.out.println("Anagram");
	}
	

	}

}
