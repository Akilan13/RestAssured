package Amazon;

import java.util.ArrayList;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,6};
		int b[] = {1,2,3,4,5,6};
		
		
		int  n1 = a.length-1;
		int n2 = b.length-1;
		
		List<Integer>e = new ArrayList<Integer>();
		
		if (n1 ==n2) {
			
			System.out.println("Both the arrays are equal");
			
		
		} else {
			
			for (int i =0;i<=a.length-1;i++) {
				
				for (int j =0;j<=b.length-1;j++) {
				
				if (a[i]==b[j]) {
					
					break;
					
				} else if (a[i]!=b[j] && j==b.length-1) {
					
					e.add(a[i]);
				}
				
				}
				
				
			}
			System.out.println(e);
		}
		

		

	}

}
