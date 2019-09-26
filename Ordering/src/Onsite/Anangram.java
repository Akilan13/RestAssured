package Onsite;

import java.util.Arrays;

public class Anangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "tood";
		
		String b = "doot";
		
		
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(b1);
		
		String a2= a1.toString();
		String b2= b1.toString().toLowerCase();
		
		if (Arrays.equals(a1, b1)) {
			
			System.out.println("Anangram");
		}
	}

}
