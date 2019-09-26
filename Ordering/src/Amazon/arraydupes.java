package Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraydupes {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint a[]
		
		int a[] = {2,4,5,6,2,3,-1,0};
		
		int b[] = {5,6,7};
		
		List<Integer>Li = new ArrayList<Integer>();
		
		for (int i =0;i<=a.length-1;i++) {
			
			Li.add(a[i]);
		}
		
		for (int i =0;i<=b.length-1;i++) {
			
			Li.add(a[i]);
		}
		
		Collections.sort(Li);
		
		System.out.println(Li);

	}

}
