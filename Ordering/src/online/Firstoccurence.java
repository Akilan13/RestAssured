package online;

public class Firstoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,2,4,5,6,4,7,5};
		
		int Count =0;
		
		int temp = Integer.MAX_VALUE;
		int temp1 = 0;
		
		
		
		for (int i =0;i<a.length-1;i++) {
			
			for (int j =i+1;j<a.length-1;j++) {
				
				if (a[i]==a[j] && j<temp) {
					
					//if (j<temp) {
						temp =j;
						temp1=a[j];
						
					//}
				}
				
			}
		}
		
		System.out.println(temp1);
	}

}
