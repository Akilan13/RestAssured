package Amazon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class commonelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,4,7};
		int b[] = {4,2,7};
		
		Set<Integer> sets = new HashSet<Integer>();
		
		int n1 = a.length-1;
		int n2 = b.length-1;
		

		
		for (int i =0;i<=n1;i++) {
			
			for (int j =0;i<=n2;j++) {
			
			
			if (a[i]==b[j]) {
				
				sets.add(a[i]);
				break;
				
			}
			
		}
			
		}
			
			System.out.println(sets);

	}

}
