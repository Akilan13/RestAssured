package Onsite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Uncommon_array {

	public static void main(String[] args) {



		int a1[] = {6,5,8,3};
        int a2[] = {4,4,7,9,55};
		int n1 = a1.length;
		int n2 = a2.length;
		
		int i=0,j=0;
		
		ArrayList<Integer> li = new ArrayList<Integer>();
		
		
		while(i<n1&&j<n2){
		
		
		if (a1[i]>a2[j]){
		
		li.add(a2[j++]);
		li.add(a1[i++]);
		
		} else if (a1[i]<a2[j]){
		
		li.add(a2[i++]);
		li.add(a1[j++]);
		
		} else {
		
		li.add(a2[j++]);
		i++;
		
		}
		
		}
		
		while(i<n1) {
		li.add(a1[i++]);
		}
		
		while(j<n2) {
		li.add(a2[j++]);
		}
		
		
		Collections.sort(li);
		System.out.println(li);
		
		


	}
	
}

