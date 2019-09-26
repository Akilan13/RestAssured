package Onsite;

public class Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,0,0,6,7,0,6,0,5};
		
		int b[] = new int [a.length];
		
		int Count=0;
		
		for (int i =0;i<a.length;i++) {
			
			if (a[i]!=0) {
				
				a[Count++]=a[i];
			}
			
		
			
		}
		
		while (Count<a.length) {
			
			a[Count++]=0;
		}
		
		for (int k:a) {
			
			System.out.println(k);
		}

	}

}
