package dot;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] q = {4,3,2,1};
		int count = 0;
		int temp = 0;
		
		for (int i = 0;i<q.length-1;i++) {
			
			
			
			//for (int j=i+1;j<q.length-1;j++) {
				
				if (q[i]>q[i+1]) {
					
					temp = q[i];
					q[i] = q[i+1];
					q[i] = temp;
					
					count++;
				}
				
			}
		
		
		for (int k:q) {
			System.out.println(k);
			
		}
		System.out.println(count);
	}

}
