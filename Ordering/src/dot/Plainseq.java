package dot;

public class Plainseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "AGEEG";
		
		int n = s.length();
		
		boolean dp[][] = new boolean [n][n];
		
		//Check for a single substring
		int maxlength =1;
		int start =0;
		for (int i =0;i<n;i++)
			
			dp[i][i]=true;
		
		//check for double string
		
		for (int i =0;i<n;i++) {
			
			if (s.charAt(i)==s.charAt(i+1)) dp[i][i]=true;	
		
		
		}
		//Check for string at 3
		
		
		
		
		
		
		
			
			

			
			
			
	
		

	}

}
