package dot;

public class Largestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {23,45,3,677,89};
		
		int val = a[0];
		
		for (int i = 0; i<a.length;i++) {
			
			if (a[i]> val) {
				
				val = a[i];
			}
		}
		
		System.out.println(val);
		
		
		

	}

}
