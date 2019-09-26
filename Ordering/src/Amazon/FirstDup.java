package Amazon;

public class FirstDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {4,3,5,6,5,7,8,4};
		
		int index = 0;
		int temp =Integer.MAX_VALUE;
		
		for (int i =0;i<=arr.length-1;i++) {
			
			for (int j =i+1;j<=arr.length-1;j++) {
				
				if (arr[i]==arr[j]) {
					
					index = i;
					
					if (index<temp) {
						
						temp =index;
					}
					
					
					
				}
			}
		}
		
		System.out.println(arr[index]);

	}

}
