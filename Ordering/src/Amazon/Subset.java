package Amazon;

import java.util.HashMap;
import java.util.Map;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] S1 = {5,8,2};
		
		int[] S2 = {5,8,2,7};
		
		int[] S3 = {1,5,4,6,8,2};
		
		
		int Size1 = S1.length-1;
		
		int Size2 = S2.length-1;
		
		int Size3 = S3.length-1;
		
		Map<Integer, Integer> map = new HashMap();
		
		for (int i =0;i<Size3;i++) {
			
			map.put(S3[i], 1);
		}
		
		for (int i =0;i<Size1;i++) {
			
			if (!map.containsKey(S1[i])) {
				
				System.out.println("S2 not a subset");
			}
			
			
		}
		
		

	}

}
