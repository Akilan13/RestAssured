package dot;

public class Duparray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1, 2, 4, 4, 1, 3, 7, 5, 5, 2};
		
		int size = a.length-1;
		
		for (int i=0;i<size;i++) {
			
			if (a[i]==a[i+1]) {
				
				System.out.println(a[i]);
				break;
			}
		}
		
	

	}

}

