package Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Simpleprimediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,4,7,5};
		int mindiff = Integer.MAX_VALUE;
		int mindif = Integer.MIN_VALUE;
		List<Integer> lis = new ArrayList<Integer>();
		
		for (int a1:a) {
			
			if (isprime(a1))
			
			lis.add(a1);
		
			
		}
		
		if (lis.size()<1) {
			
			System.out.println(-1);
		}
		
		Collections.sort(lis);
		
		int diff;
		for (int i =0;i<lis.size()-1;i++) {
			
			
			
			diff = (lis.get(i+1)-lis.get(i));
			
			if (diff<mindiff) {
				
				mindif = diff;
				
			}
			
			
		}
		
		
	System.out.println(mindif);
			
			
		}
	
	static boolean isprime(int a) {
		
		boolean flag =false;
		
		for (int j =2;j<=a/2;j++) {
			
			int temp = a%j;
			
			if (temp==0) {
				
				return false;
			
				
			} 			
			
			
		}
		
		return true;
		
	}
			

	}


