package Amazon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar1 = { 1,3,5,7,9,11,45,67};
        int[] ar2 = { 2,4,6,8,9,11,34,56,789,789,999,1000};
        
        Set<Integer>Sets = new HashSet<Integer>();
        
        for (int i =0;i<=ar1.length-1;i++) {
        	
        	Sets.add(ar1[i]);
        }
        
        for (int j =0;j<=ar2.length-1;j++) {
        	
        	Sets.add(ar2[j]);
        }
        
        Object[] a = Sets.toArray();
        
        Arrays.sort(a);
        
        for (Object f: a) {
     	   
     	   System.out.print(f);
        }
	}

}
