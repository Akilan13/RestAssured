package Amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Conscu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {0,1,1,1,5,4,6,1};
		
		int count =0;
		
		//Map<Integer, Integer> map = new HashMap();
		
		for (int i =0;i<a.length-1;i++) {
			
			if (a[i] ==1) {
				
				count++;
			} else {
				
				count=0;
			}
			
			if (count >=3) {
				
				System.out.println("Conse");
				break;
			} 
		
		}
		
 
	}

}
