package dot;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c = 0, temp =0;
		
		int n = 153;
		

		
		
		while (n>0) {
			
			int a = n%10;
			n = n/10;
			c= c+ (a*a*a);
			
			
			
		}
		
		System.out.println(c);
		System.out.println(n);

	}

}
