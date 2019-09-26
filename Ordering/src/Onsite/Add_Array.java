package Onsite;

import java.util.ArrayList;

public class Add_Array {

	public static void main(String[] args) {

		int a1[] = {1345674,5,8,3};
        int a2[] = {1456,4,7,9};
		
		int n1 = a1.length;
		int n2 = a2.length;
		
		int i=0,j=0,sum2=0;
		
		ArrayList<Integer> li = new ArrayList<Integer>();
		
		while (i<n1&&j<n2){
		
		int sum = a1[i]+a2[j];
		
		if (sum>=9){
		
		
		String s1 = Integer.toString(sum);
		
		String[] s2 = s1.split("");
		
		do{
			sum2 =0;
		for (int k=0;k<s2.length;k++){
		 
		 sum2 = sum2 + Integer.parseInt(s2[k]);
		}
		
		if (sum2>9) {
			s1 = Integer.toString(sum2);
			
			s2 = s1.split("");	
			
		} else {
			
			break;
		}
		
		} while(sum2>=9);
		
		li.add(sum2);
		i++;
		j++;
		} else {
		
		li.add(sum);
		i++;
		j++;
		}
		

		
		
		}
System.out.println(li);
}
}