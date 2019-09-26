package dot;

import java.util.HashSet;
import java.util.Set;

public class Swap {

	public static void main(String[] args) {
		 
	        int totalBribeCount = 0;
	        int temp =0;
	        int[]  q = {2,1,4,3,6,5};   
	        
	   	 for (int i =0;i<q.length;i++){

	         if ((q[i]-(i+1))>2){
	             System.out.println("Too chaotic");
	             return;
	         }
	     }
	        
	        for (int i=0;i<q.length-1;i++) {
	        	
				if (q[i]>q[i+1]) {
					
					temp = q[i];
					q[i]=q[i+1];
					q[i+1] = temp;
					
					totalBribeCount++;
					
				}
				
	        }
	        
	        System.out.println(totalBribeCount);
	        
	        
	


}
}
