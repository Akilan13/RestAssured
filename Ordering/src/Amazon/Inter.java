package Amazon;

import java.util.HashMap;
import java.util.Map;

public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {120, 213, 123, 111, 456};
		

		
		Map<Integer,Integer>mi = new HashMap<Integer,Integer>();

		for (int i =0;i<=a.length-1;i++){

		    int Sum=0;

		    
		    int n = a[i]/10;
		    int m = a[i]%10;
		    
		    System.out.println(1/10);
		    
		  
		    
		    while(m>0){
		     Sum=Sum+m;
		    m=n%10;
		    n =n/10;
		    }
		    
		    
		    
		    
		        
		        mi.put(a[i],Sum);
		    
		    
		    
		}
		
		System.out.println(mi);

	}

}
