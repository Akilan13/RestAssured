package dot;

public class Google {
	
	public static void main(String[] args) {

		
		int a[] = {10,45,89,12,56,78};
		
		int Largest = a[0];
		int Secondlargest = a[0];
		
		for (int i=0; i<a.length; i++) {
			
			if (a[i] > Largest) {
				
				Largest = a[i];
			}
		 else if (a[i]> Secondlargest && a[i]!= Largest) {
			
			 Secondlargest = a[i];
			
		}
			
					
		}
		
		System.out.println(Secondlargest);
		
	}

}
