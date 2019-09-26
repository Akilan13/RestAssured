package Amazon;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ageega";
		
		boolean a[][] = new boolean[6][6];
		
		int startindex = 0;
		int Maxlength = 0;
		int n = s.length();
		
		for (int i =0;i<s.length();i++) {
			
			a[i][i]=true;
			
			startindex=i;
			Maxlength = 1;
			
		}
		
		for (int i =0;i<s.length()-1;i++) {
			int j = i+1;
			
			if (s.charAt(i)==s.charAt(j)) {
				
				a[i][j]=true;
				startindex=i;
				Maxlength = 2;
				
			}
			

			
		}
		
		//For characters greater than two
		for (int k =3;k<=s.length();k++) {
			
		//Fixing the starting index
			
			for (int i=0;i<n-k+1;i++) {
				
				int j = i+k-1;
				
				if (s.charAt(i)==s.charAt(j) && a[i+1][j-1]) {
					
					a[i][j]=true;
					
					if (k>Maxlength) {
						
						Maxlength=k;
						startindex = i;
					}
				}
			}
			
			
		}
		
		System.out.println(s.substring(startindex, Maxlength+1));
		
		

	} 

}
