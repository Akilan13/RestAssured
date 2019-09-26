package Amazon;

public class ArraySumequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,0,1,12,-2,-8};
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i =1;i<a.length;i++) {
				for (int j =0;j<i;j++) {
				
				sum1+=a[j];
			}
			
			
			for (int k =i+1;k<a.length;k++) {
				
				sum2+=a[k];
			}
			
			
			if (sum1==sum2) {
				
				System.out.println(sum1);
				
							for(int l=0;l<=i;l++) {
					
								System.out.println(a[l]);
			
								}
				
					System.out.println(sum2);
								for(int l=i+1;l<a.length;l++) {
					
									System.out.println(a[l]);
			
									}
				
			}
			
			sum1=0;
			sum2 =0;
			
		}
		
		
	}

}
