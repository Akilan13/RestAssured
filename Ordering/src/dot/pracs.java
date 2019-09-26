package dot;

public class pracs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="sgeegs";
		System.out.println(s);
		int n = s.length();
		//char[] s1 = s.toCharArray();
		
		int[][] l = new int [n][n];
		
		for (int i=0;i<s.length();i++) {
			
			l[i][i] = 1;
			}
		
		for (int cl=2;cl<=s.length();cl++) {
			
			for (int i=0;i<n-cl+1;i++) {
				
				int j = i+cl-1;
				
				if (s.charAt(i)==s.charAt(j) && cl==2) {
					
					l[i][j]=2;
				} else if (s.charAt(i)==s.charAt(j)) {
					
					l[i][j] = l[i+1][j-1]+2;
				} else {
					
					l[i][j] = max(l[i][j-1],l[i+1][j]);
				}
			}
		}
		
		int Maxlength = l[0][n-1];
		System.out.println(Maxlength);
	}

	static int max (int x, int y) { return (x > y)? x : y; } 

}
