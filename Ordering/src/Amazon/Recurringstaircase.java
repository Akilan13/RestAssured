package Amazon;

public class Recurringstaircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,3,5};
		int n = a.length-1;
		
		int total=0;
		
		if (n==0 || n==1) {
			
			 total =1;
		} 
		
		
		for (int i =0;i<=n;i++) {
			
			if (a[i]==0 || a[i] ==1) {
				
				total += 1;
				
			} else {
				
				total += (a[i]-1) + (a[i]-2);
			}
		}
			
			
			
		
System.out.println(total);
		
		

	}

}
