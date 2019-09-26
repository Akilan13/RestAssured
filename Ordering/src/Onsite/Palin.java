package Onsite;

import java.util.HashMap;
import java.util.Map;

public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "gagshghmomuiuhj";
		
		int Start =0;
		int Maxlength =0;
		int n = s.length();
		
		Map<String,Integer>ma = new HashMap<String,Integer>();
		
		boolean a[][] = new boolean[n][n];
		
		//printing for 1 character
		
		for (int i =0;i<s.length();i++) {
			
			a[i][i] = true;
		}
		
		//Printing for two characters
		
		for (int i =0;i<n-1;i++) {
			int j = i+1;
			if (s.charAt(i)==s.charAt(j)) {
				a[i][j] = true;	
				Start = i;
				Maxlength=2;
				
			
			}
						
			}
			
			
		//Printing third character
			
			for (int cl=3;cl<=n;cl++) {
				
				//Starting Index
				for (int m=0;m<=n-cl;m++) {
					//Ending Index 
					
					int p = m+cl-1;
					
					
					if (s.charAt(m)==s.charAt(p) && a[m+1][p-1]) {
						
						a[m][p]=true;
						
						if (p>Maxlength) {
							
							Start = m;
							Maxlength =p;
							ma.put(s.substring(Start, Maxlength+1), Maxlength);
						}
					}
					
				}
			
				
			}
			
			//System.out.println(s.substring(Start, Maxlength+1));
			System.out.println(ma);
		}
		
		

	}


