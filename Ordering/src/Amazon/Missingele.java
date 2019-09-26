package Amazon;

import java.util.HashSet;
import java.util.Set;

public class Missingele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,4,5,6,7};
		int b[]= {1,2,3,4,5,6,7};
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> set2=new HashSet<Integer>();
		for(int num:a)
			set1.add(num);
		
		for(int num:b)
			set2.add(num);
		
		int N1 = set1.size();
		int N2 = set2.size();
		
		if (N1>N2) {
		set1.removeAll(set2);
		System.out.println(set1);
			
		} else {
			set2.removeAll(set1);
			System.out.println(set2);
			
		}

	}

}
