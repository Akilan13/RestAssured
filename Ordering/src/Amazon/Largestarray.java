package Amazon;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Largestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] S1 = {1,2,3,4};
		int[] S2 = {5,6,9,8,-11};
		
		Set<Integer>S3 = new HashSet<Integer>();
		
		for (int i =0;i<S1.length-1;i++) {
			
			S3.add(S1[i]);
		}
		
		for (int i =0;i<S2.length-1;i++) {
			
			S3.add(S2[i]);
		}
		
		System.out.println(S3);
		
		
		}

}
